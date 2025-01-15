import static java.lang.Math.PI;

public class Cone extends Shape3D{

    public Cone(double h ,double r){
        super(h,r);
    }

    @Override
    double getVolume() {
        return (1.0/3.0)*height*PI*radius*radius;
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }
}
