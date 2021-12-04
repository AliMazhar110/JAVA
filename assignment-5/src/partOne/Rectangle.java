package partOne;

public class Rectangle extends Shape{
    private double width, length;
    public Rectangle(){
        super();
        this.width = 0.0;
        this.length = 0.0;
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    double getLength(){
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width+length);
    }
    @Override
    public String toString(){
        return "Rectangle " + getColor() + isFilled();
    }
}
