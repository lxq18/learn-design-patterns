package com.lxq18.learn.design.patterns.factory_method;

public class MachineFactory {
    private static boolean shouldClean() {
        return System.currentTimeMillis() % 2 == 0;
    }

    public static Machine make() {
        return shouldClean() ? new CleanFloorMachine() : new MakeFoodMachine();
    }
}
