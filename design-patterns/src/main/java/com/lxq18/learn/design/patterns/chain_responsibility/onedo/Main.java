package com.lxq18.learn.design.patterns.chain_responsibility.onedo;

import javax.servlet.Filter;

public class Main {
    public static void main(String[] args) {

        /*ConcreteHandler handler1 = new ConcreteHandler();
        ConcreteHandler handler2 = new ConcreteHandler();
        handler1.setNextHandler(handler2);
        handler1.doHandler();*/

        ProjectHandler projectHandler = new ProjectHandler();
        DeptHandler deptHandler = new DeptHandler();
        GeneralHandler generalHandler = new GeneralHandler();
        projectHandler
                .setNextHandler(deptHandler)
                .setNextHandler(generalHandler);

        projectHandler.doHandler("lwx", 450);
        projectHandler.doHandler("lwx", 600);
        projectHandler.doHandler("zy", 600);
        projectHandler.doHandler("zy", 1500);
        projectHandler.doHandler("lwxzy", 1500);
    }
}
