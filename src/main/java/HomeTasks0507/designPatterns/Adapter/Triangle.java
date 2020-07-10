package HomeTasks0507.designPatterns.Adapter;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Trójkat namalowany");
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
