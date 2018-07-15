package com.lxq18.learn.design.patterns.chain_responsibility.onedo;

public abstract class ConsumeHandler {

    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler() {
        return nextHandler;
    }

    public ConsumeHandler setNextHandler(ConsumeHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    /**
     * user申请人 free报销费用
     */
    public abstract void doHandler(String user, double free);

}

