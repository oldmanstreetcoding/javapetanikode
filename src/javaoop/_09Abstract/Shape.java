package javaoop._09Abstract;

abstract public class Shape {

    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    abstract float getArea();
}
