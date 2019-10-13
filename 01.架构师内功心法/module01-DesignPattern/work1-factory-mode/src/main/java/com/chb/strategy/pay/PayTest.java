package com.chb.strategy.pay;

public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("1","5505055050",1000);
        System.out.println(order.pay());
    }
}
