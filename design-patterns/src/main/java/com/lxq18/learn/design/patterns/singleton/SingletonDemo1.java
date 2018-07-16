package com.lxq18.learn.design.patterns.singleton;

public class SingletonDemo1 {
    private static SingletonDemo1 instance;

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo1();
        }
        return instance;
    }
}
