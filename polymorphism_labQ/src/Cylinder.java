import static java.lang.Math.PI;

public class Cylinder extends Shape3D{

    public Cylinder(double h ,double r){
        super(h,r);

    }

    @Override
    double getVolume() {
        return PI*radius*radius*height;
    }

    @Override
    double getArea() {
        return (2*PI*radius*height)+(2*PI*radius*radius);
    }
}
