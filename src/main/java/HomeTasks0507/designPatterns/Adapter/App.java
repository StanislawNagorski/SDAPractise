package HomeTasks0507.designPatterns.Adapter;

public class App {

    public static void main(String[] args) {

        ShapeManager shapeManager = new ShapeManager();
        shapeManager.addShape(new Square());
        shapeManager.addShape(new Triangle());
        Circle circle = new Circle();
        shapeManager.addShape(new CircleAdapter(circle));
        shapeManager.drawAllShapes();
    }
}
