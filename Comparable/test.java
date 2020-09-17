package Comparable;
import  java.util.Arrays;
public class main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] =new ComparableCircle();
        circles[2] = new ComparableCircle(3.9,"blue",false);
        System.out.println("XXXXX");
        for(ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi xxxx");
        for(ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
