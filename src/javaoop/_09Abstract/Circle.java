package javaoop._09Abstract;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
