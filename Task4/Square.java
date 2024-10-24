package Task4;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) { //constructor
        this.sideLength = sideLength;
    }
    public double getArea(){
        return sideLength * sideLength;

    }
}
