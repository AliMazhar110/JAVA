package partOne;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        this.radius = 0.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle " + getColor() + isFilled();
    }
}
