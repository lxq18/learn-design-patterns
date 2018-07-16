package com.lxq18.learn.design.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cilent {
    public static final Logger LOGGER = LoggerFactory.getLogger(Cilent.class);

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        LOGGER.info("=================");
        computer.shutDown();
    }
}
