package interfaceColorable;

public class main {
    public static void main(String[] args) {
        Square square = new Square(1);
        square.howToColor();
    }
//    public Shape createShape() {
//        int index = (int) (Math.random()*2 )    ;
//        if(index == 0) {
//            Circle circle = new Circle((int) (Math.random()*10 + 1));
//            System.out.println("------ " + circle.toString());
//            circle.resize((int) (Math.random()*100 + 1));
//            return circle;
//        } else if (index  == 1) {
//            Rectangle rectangle = new Rectangle((int) (Math.random()*10 + 1),(int) (Math.random()*10 + 1));
//            System.out.println("------ " + rectangle.toString());
//            rectangle.resize((int) (Math.random()*100 + 1));
//            return rectangle;
//        } else if (index == 2) {
//            Square square = new Square((int) (Math.random()*10 + 1));
//            System.out.println("------ " + square.toString());
//            square.resize((int) (Math.random()*100 + 1));
//            return square;
//        }
//        return null;
//    }
}
