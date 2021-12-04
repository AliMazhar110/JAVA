package partOne;

public class Square extends Rectangle{
    double side;
    public Square(){
        this.side = 0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
        this.side = side;
    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    @Override
    void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square "+getColor()+isFilled();
    }
}
