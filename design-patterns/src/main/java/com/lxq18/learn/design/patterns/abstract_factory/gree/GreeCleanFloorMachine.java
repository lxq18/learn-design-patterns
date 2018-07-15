package com.lxq18.learn.design.patterns.abstract_factory.gree;

import com.lxq18.learn.design.patterns.abstract_factory.Machine;

public class GreeCleanFloorMachine implements Machine {
    @Override
    public void doWork() {
        System.out.println("gree machine:i am clean the floor.");
    }
}
