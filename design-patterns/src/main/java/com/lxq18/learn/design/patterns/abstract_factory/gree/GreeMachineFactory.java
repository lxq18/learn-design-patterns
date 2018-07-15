package com.lxq18.learn.design.patterns.abstract_factory.gree;

import com.lxq18.learn.design.patterns.abstract_factory.Machine;
import com.lxq18.learn.design.patterns.abstract_factory.MachineFactory;

public class GreeMachineFactory extends MachineFactory {
    @Override
    public Machine make() {
        return shouldClean() ? new GreeCleanFloorMachine() : new GreeMakeFoodMachine();
    }
}
