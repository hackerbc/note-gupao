package com.chb.observer.gperadvice;


public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        /*
         *将观察者添加到此对象的观察者集，前提是
         *它与集合中的某个观察者不同。
         */
        gper.addObserver(tom);
        gper.addObserver(mic); //业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publishQuestion(gper, question);
    }
}
