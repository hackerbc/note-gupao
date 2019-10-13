package com.chb.observer.iobserver;

public class ITest {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.addObserver(teacher);
        student.run();
    }
}
