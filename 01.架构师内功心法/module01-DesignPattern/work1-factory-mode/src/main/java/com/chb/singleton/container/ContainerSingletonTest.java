package com.chb.singleton.container;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        User user1 = (User) ContainerSingleton.getBean(User.class);
        User user2 = (User) ContainerSingleton.getBean(User.class);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }
}
