package com.lxq18.learn.design.patterns.abstract_factory.midea;

import com.lxq18.learn.design.patterns.abstract_factory.Machine;
import com.lxq18.learn.design.patterns.abstract_factory.MachineFactory;

public class MideaMachineFactory extends MachineFactory {
    @Override
    public Machine make() {
        return shouldClean() ? new MideaCleanFloorMachine() : new MideaMakeFoodMachine();
    }
}
