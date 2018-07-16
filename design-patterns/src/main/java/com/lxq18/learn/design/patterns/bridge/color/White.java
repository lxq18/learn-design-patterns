package com.lxq18.learn.design.patterns.bridge.color;

import com.lxq18.learn.design.patterns.bridge.Color;

public class White implements Color {

    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }

}
