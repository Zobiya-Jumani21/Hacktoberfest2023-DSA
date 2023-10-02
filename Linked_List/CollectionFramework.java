package Linked_List;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("is");
        list.addLast("as");
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));

            list.removeFirst();
            System.out.println(list);
            list.removeLast();
            System.out.println(list);
        }

    }
}
