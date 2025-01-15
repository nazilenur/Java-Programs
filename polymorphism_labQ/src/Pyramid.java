import static java.lang.Math.PI;
public class Pyramid extends Shape3D{

    public Pyramid(int h,int w,int depth){

        super(h,w,depth);
    }

    @Override
    double getVolume() {
        return (1.0/3.)*width*height;
    }

    @Override
    double getArea() {
        return 0.5*width*height+width;
    }
}
