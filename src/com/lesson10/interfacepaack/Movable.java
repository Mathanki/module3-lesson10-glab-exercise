package com.lesson10.interfacepaack;

public interface Movable {
    void moveUp();    // "public" and "abstract" by default

    void moveDown();

    void moveLeft();

    void moveRight();

    String getCoordinate();

}
