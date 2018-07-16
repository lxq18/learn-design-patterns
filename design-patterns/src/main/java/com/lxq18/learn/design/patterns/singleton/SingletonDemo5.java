package com.lxq18.learn.design.patterns.singleton;

public class SingletonDemo5 {
    private static class SingletonHolder {
        private static final SingletonDemo5 instance = new SingletonDemo5();
    }

    private SingletonDemo5() {
    }

    public static final SingletonDemo5 getInsatance() {
        return SingletonHolder.instance;
    }
}
