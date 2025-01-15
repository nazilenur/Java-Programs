import static java.lang.Math.PI;

public class Sphere extends Shape3D{

    public Sphere(int depth,double r){
        super(depth,r);
    }

    @Override
    double getArea() {
        return 4.0*PI*radius*radius ;
    }

    @Override
    double getVolume() {
        return (4.0/3.0)*PI*radius*radius*radius;
    }
}
