package HomeTasks0507.designPatterns.Adapter;

public class CircleAdapter extends Circle implements Shape{

    private Circle circle;

    public CircleAdapter(Circle circle){
        this.circle = circle;
    }

    //TODO to to to?


    @Override
    public void draw() {
        circle.draw();
    }

    @Override
    public double getCircumference() {
       return circle.getCircumference();
    }
}
