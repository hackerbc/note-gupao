package com.chb.template.course;

/**
 * 模板会有一个或者多个未实现的方法
 * 未实现方法有固定的执行逻辑
 */
public abstract class NetworkCourse {
    protected  final void createCourse(){
        //1.发布预习资料
        this.postPreResource();
        //2.制作ppt课件
        this.createPPT();
        //3.在线直播
        this.liveVideo();
        //4.提交课件、课堂笔记
        this.postNote();
        //5.提交源码
        this.postSource();
        //6.如果有布置作业
        if(this.needHomework()){
            this.checkHomework();
        }
    }

    abstract void checkHomework();
    //钩子方法，实现流程的微调
    protected boolean needHomework(){return false;}

    protected void postSource(){
        System.out.println("提交源代码");
    }

    protected void postNote(){
        System.out.println("提交课件和笔记");
    }

    protected void liveVideo(){
        System.out.println("直播授课");
    }

    protected void createPPT(){
        System.out.println("创建备课PPT");
    }

    protected void postPreResource(){
        System.out.println("分发预习资料");
    }
}
