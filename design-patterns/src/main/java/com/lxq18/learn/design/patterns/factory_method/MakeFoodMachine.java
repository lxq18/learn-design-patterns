package com.lxq18.learn.design.patterns.factory_method;

public class MakeFoodMachine implements Machine {
    @Override
    public void doWork() {
        System.out.println("i am do some food.");
    }
}
