import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shape2D s1=new Circle(5);
        Shape2D s2=new Square(10);
        Shape2D s3=new Rectangle(5,10);
        Shape3D s4=new Cylinder(20,4);
        Shape3D s5=new Sphere(7,4);
        Shape3D s6=new Pyramid(7,8,9);
        Shape3D s7=new Cone(6,4);

        Shape2D[] shapes2=new Shape2D[]{s1,s2,s3};
        Shape3D[] shapes3=new Shape3D[]{s4,s5,s6,s7};

        for(Shape2D s:shapes2){
            System.out.println(s.toString() + " Area : " +  s.getArea());
        }

        for(Shape3D s:shapes3){
            System.out.println(s.toString() + " Area " + s.getArea() +  " Volume : " + s.getVolume() );
        }

    }
}