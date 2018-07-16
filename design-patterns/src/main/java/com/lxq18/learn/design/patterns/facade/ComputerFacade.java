package com.lxq18.learn.design.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComputerFacade {
    public static final Logger LOGGER = LoggerFactory.getLogger(ComputerFacade.class);

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        LOGGER.info("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        LOGGER.info("Computer start end");
    }

    public void shutDown() {
        LOGGER.info("Computer shutDown begin");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        LOGGER.info("Computer shutDown end...");
    }
}
