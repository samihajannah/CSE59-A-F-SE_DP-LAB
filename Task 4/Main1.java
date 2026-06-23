import java.util.List;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class AreaCalculator {

    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }
}

public class Main1{
    public static void main (String[] args){
        List<Shape> shapes = List.of(
            new Rectangle(4,5), //Area = 20
            new  Circle(3),   // Area ≈ 28.27
            new Triangle(6,4) // Area = 12

        );
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}
