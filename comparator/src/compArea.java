import java.util.Comparator;

public class compArea implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return (int)(c1.calcArea()-c2.calcArea());
    }
}
