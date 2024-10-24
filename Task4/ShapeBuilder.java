package Task4;
import java.util.*;

public class ShapeBuilder {
    private ArrayList<Shape> shapeList;

    public ShapeBuilder() {
        shapeList = new ArrayList<>();
    }

    public void addShape(Shape s){
        shapeList.add(s);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for (Shape s : shapeList){
            totalArea += s.getArea(); //adds all the shapes in the list together and then returns them below
        }
        return totalArea;
    }

}
