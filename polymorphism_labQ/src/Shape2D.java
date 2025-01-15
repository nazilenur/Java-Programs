public abstract class Shape2D {
    protected final double PI=3.14;
    protected double height;
    protected double radius;
    protected double width;

    public Shape2D(double h,double w){
        this.height=h;
        this.width=w;
        this.radius=0;
    }
    public Shape2D(double r){
        this.radius=r;
        this.height=0;
        this.width=0;
    }


    abstract double getArea();


@Override
public String toString() {
    return "Height : " + height + "Radius : " + radius +
            "Width : " + width ;
}
}