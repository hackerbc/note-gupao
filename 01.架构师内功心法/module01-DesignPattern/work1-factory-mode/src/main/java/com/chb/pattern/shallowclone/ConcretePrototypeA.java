package com.chb.pattern.shallowclone;

public class ConcretePrototypeA implements Prototype ,Cloneable {
    private int age;
    private String name;
    private User hibbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getHibbies() {
        return hibbies;
    }

    public void setHibbies(User hibbies) {
        this.hibbies = hibbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHibbies(getHibbies());
        return concretePrototype;
    }
}
