package com.lxq18.learn.design.patterns.bridge;

public abstract class Shape {
    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
