package com.lxq18.learn.design.patterns.bridge.shape;

import com.lxq18.learn.design.patterns.bridge.Shape;

public class Rectangle extends Shape {

    public void draw() {
        color.bepaint("长方形");
    }

}
