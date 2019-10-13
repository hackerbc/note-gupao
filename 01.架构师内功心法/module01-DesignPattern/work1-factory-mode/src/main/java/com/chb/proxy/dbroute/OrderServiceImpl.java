package com.chb.proxy.dbroute;

public class OrderServiceImpl implements OderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        orderDao = new OrderDao();
    }

    @Override
    public int createOder(Order order) {
        System.out.println("OrderServiceImpl调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
