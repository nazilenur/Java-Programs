public class Rectangle extends Shape2D {

    public Rectangle(double h , double w ){
        super(w,h);
    }

    @Override
    double getArea() {
        return width*height;
    }
}
