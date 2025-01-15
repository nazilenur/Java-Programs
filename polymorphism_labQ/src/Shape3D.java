public abstract class Shape3D extends Shape2D {
    protected double depth;

    public Shape3D(double h , double w,double depth){
        super(h,w);
        this.depth=depth;
    }

    public Shape3D(double h ,double r){
        super(h,r);

    }

    abstract double getVolume();

    @Override
    public String toString() {
        return super.toString()+ "Depth : " + depth;
    }
}
