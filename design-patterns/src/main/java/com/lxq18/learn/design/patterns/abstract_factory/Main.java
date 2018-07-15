package com.lxq18.learn.design.patterns.abstract_factory;

import com.lxq18.learn.design.patterns.abstract_factory.gree.GreeMachineFactory;
import com.lxq18.learn.design.patterns.abstract_factory.midea.MideaMachineFactory;

public class Main {
    public static void main(String[] args) {
        Machine greeMachine = new GreeMachineFactory().make();
        greeMachine.doWork();
        Machine mideaMachine = new MideaMachineFactory().make();
        mideaMachine.doWork();
    }
}
