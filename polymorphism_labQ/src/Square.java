public class Square extends Shape2D{

    public Square(double w){
        super(0,w);
    }

    @Override
    double getArea() {
        return width*width;
    }
}
