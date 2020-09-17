package interfaceResizeable;

public class main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Truoc");
        System.out.println(square.getArea());
        square.resize(10);
        System.out.println("Sau");
        System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("Before");
        System.out.println(rectangle.getArea());
        rectangle.resize(7);
        System.out.println("Sau");
        System.out.println(rectangle.getArea());
        Circle circle = new Circle(7);
        System.out.println("Before");
        System.out.println(circle.getArea());
        circle.resize(4);
        System.out.println("Sau");
        System.out.println(circle.getArea());
    }
}
