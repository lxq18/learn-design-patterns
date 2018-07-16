package com.lxq18.learn.design.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Memory子系统类
 *
 * @author Administrator
 */
public class Memory {
    public static final Logger LOGGER = LoggerFactory.getLogger(Memory.class);

    public void start() {
        LOGGER.info("Memory is start...");
    }

    public void shutDown() {
        LOGGER.info("Memory is shutDown...");
    }
}
