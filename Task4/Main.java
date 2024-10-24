package Task4;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Square square1 = new Square(4);

        System.out.println(circle1.getArea());
        System.out.println(square1.getArea());
        System.out.println(" ");

        ShapeBuilder sb1 = new ShapeBuilder();
        sb1.addShape(circle1);
        sb1.addShape(square1);
        System.out.println(sb1.getTotalArea());
    }
}
