package com.lxq18.learn.design.patterns.factory_method;

public class CleanFloorMachine implements Machine {
    @Override
    public void doWork() {
        System.out.println("i am clean the floor.");
    }
}
