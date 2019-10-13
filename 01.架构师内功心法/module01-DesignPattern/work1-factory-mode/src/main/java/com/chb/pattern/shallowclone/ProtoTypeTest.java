package com.chb.pattern.shallowclone;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setHibbies(new User());
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");
        System.out.println(concretePrototype);
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone();
        System.out.println(concretePrototypeClone);
        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHibbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getHibbies());
        System.out.println("对象地址比较：" + (concretePrototypeClone.getHibbies() == concretePrototype.getHibbies()));*/
        User user = new User();
        user.clone();
    }

}
