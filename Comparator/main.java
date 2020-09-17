package Comparator;
import java.util.Comparator;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.8);
        circles[1] = new Circle();
        circles[2] = new Circle("blue",true,2.9);
        System.out.println("Truoc");
        for(Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("Sau");
        for(Circle circle : circles) {
            System.out.println(circle);
        }



    }
}
