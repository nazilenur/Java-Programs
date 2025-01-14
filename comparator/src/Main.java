import java.util.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Circle c1=new Circle(5.5,"Red");
        Circle c2=new Circle(21.0,"Black");
        Circle c3=new Circle(3.2,"Brown");

        List<Circle>CircleList=new LinkedList<>();
        CircleList.add(c1);
        CircleList.add(c2);
        CircleList.add(c3);

        ListIterator iter=CircleList.listIterator();

        //Collections.sort(CircleList,new compArea());

        Collections.sort(CircleList,new colorComp());

        while(iter.hasNext())
            System.out.println(iter.next());



    }
}