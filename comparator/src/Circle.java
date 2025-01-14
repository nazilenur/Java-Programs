public class Circle {
    static final double pi=3.14;
    double radius;
    String color;

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    double calcArea(){
        return radius*radius*pi;
    }

    @Override
    public String toString() {
        return "Color " + color + "Radius : " + radius + "Area : " +calcArea();
    }
}
