package com.chb.proxy.dbroute;

import com.chb.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest {
    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2017/02/01");
        order.setCreateTime(date.getTime());

        OderService orderService = (OderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        orderService.createOder(order);
    }
}
