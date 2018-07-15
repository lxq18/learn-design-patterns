package com.lxq18.learn.design.patterns.abstract_factory.midea;

import com.lxq18.learn.design.patterns.abstract_factory.Machine;

public class MideaCleanFloorMachine implements Machine {
    @Override
    public void doWork() {
        System.out.println("midea machine:i am clean the floor.");
    }
}
