package com.lxq18.learn.design.patterns.abstract_factory;

public abstract class MachineFactory {
    protected static boolean shouldClean() {
        return System.currentTimeMillis() % 2 == 0;
    }

    public abstract Machine make();
}
