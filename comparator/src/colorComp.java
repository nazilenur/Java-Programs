import java.util.Comparator;

public class colorComp implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return c1.color.compareTo(c2.color);
    }
}
