package com.mei_husky.samplemvvm.model;

/**
 * Created by QingMei on 2017/5/21 21:31
 * email:mei_husky@qq.com
 * desc:Used to
 */

public class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}