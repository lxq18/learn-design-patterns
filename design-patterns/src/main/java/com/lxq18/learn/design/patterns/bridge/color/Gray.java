package com.lxq18.learn.design.patterns.bridge.color;

import com.lxq18.learn.design.patterns.bridge.Color;

public class Gray implements Color {

    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
