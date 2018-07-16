package com.lxq18.learn.design.patterns.facade;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * cpu子系统类
 *
 * @author Administrator
 */
public class CPU {
    public static final Logger LOGGER = LoggerFactory.getLogger(CPU.class);

    public void start() {
        LOGGER.info("cpu is start...");
    }

    public void shutDown() {
        LOGGER.info("CPU is shutDown...");
    }
}
