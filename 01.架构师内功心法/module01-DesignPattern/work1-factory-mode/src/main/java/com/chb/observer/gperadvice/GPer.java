package com.chb.observer.gperadvice;

import java.util.Observable;
//Observable可观察者
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gper = null;

    public GPer(){}

    public static GPer getInstance() {
        if (gper == null) {
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }
    public void publishQuestion(GPer gper, Question question){
        System.out.println(question.getUserName() + "在" +this.name +"上提交了一个问题！");
        //将可观察的对象标记为已更改；
        setChanged();
        /*
        如果此对象已更改，则
        *<code>已更改方法，然后通知其所有观察者
        *然后调用clearchanged方法来指示
        *此对象已不再更改。
        *每个观察者都用两个
        *参数：这个可观察对象和<code>arg</code>参数。
         */
        notifyObservers(question);
    }
}
