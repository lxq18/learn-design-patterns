package com.lxq18.learn.design.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Disk子系统类
 *
 * @author Administrator
 */
public class Disk {
    public static final Logger LOGGER = LoggerFactory.getLogger(Disk.class);

    public void start() {
        LOGGER.info("Disk is start...");
    }

    public void shutDown() {
        LOGGER.info("Disk is shutDown...");
    }
}
