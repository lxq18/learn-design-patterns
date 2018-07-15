package com.lxq18.learn.design.patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        Machine machine = MachineFactory.make();
        machine.doWork();
    }
}
