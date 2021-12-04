package partOne;

abstract class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        color = null;
        filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    String getColor(){
        return color;
    }
    boolean isFilled(){
        return filled;
    }
    void setColor(String color){
        this.color = color;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
