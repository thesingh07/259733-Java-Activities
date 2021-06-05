import java.util.Scanner;
public class ShapeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Circle\nSquare\nEnter the shape");
        String shape = s.next();
        shape = shape.toLowerCase();
        if (shape.equals("circle")) {
            Circle c = new Circle();
            System.out.println("Enter the radius: ");
            int radius = s.nextInt();
            c.calculateArea(radius);
        } else if (shape.equals("square")) {
            Square sq = new Square();
            System.out.println("Enter the side: ");
            int side = s.nextInt();
            sq.calculateArea(side);
        } else {
            System.out.println("Invalid Input");
        }
    }

}