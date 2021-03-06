package Comparable;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private boolean filled = true;
    public Circle () {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color,boolean filled, double radius) {
        this.color = color;
        this.filled = filled;

        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter () {
        return 2 * radius * Math.PI;
    }


    public String toString() {
        return "A Circle with radius =" + getRadius() ;
    }
}