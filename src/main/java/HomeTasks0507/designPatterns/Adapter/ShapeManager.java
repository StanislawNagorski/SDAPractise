package HomeTasks0507.designPatterns.Adapter;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

    private List<Shape> listOfShapes;

    public ShapeManager(){
        listOfShapes = new ArrayList<>();
    }

    public boolean addShape(Shape shape){
        return listOfShapes.add(shape);
    }

    public void drawAllShapes(){
        listOfShapes.forEach(Shape::draw);
    }

    public void printAllCircumference(){
        listOfShapes.forEach(shape -> System.out.println(shape.getCircumference()));
    }

}

//Napisać klasę ShapreManager która ma listę Shape-ów. Napisać metodę która dodaje do tej listy kolejny Shape, oraz metodę drawAllShapers
//i printAllCircumference
