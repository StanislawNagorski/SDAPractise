package HomeTasks0507.designPatterns.Adapter;

public class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Kwadrat");
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
