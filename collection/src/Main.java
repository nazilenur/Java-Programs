import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.add("Abant");
        linkedList.add("Mergen");
        linkedList.add("Gerede");

        ListIterator listIterator= linkedList.listIterator();

        System.out.println("\nForward iterator\n ");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\nBackward iterator\n");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}