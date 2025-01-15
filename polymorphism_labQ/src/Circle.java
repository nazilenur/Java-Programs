
public class Circle extends Shape2D{

    public Circle(double r){
        super(r);
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }
}
