import java.util.ArrayList;

public class SearchElementInanArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("grape");
        list.add("Orange");
        list.add("Kiwi");

        String target = "Kiwi";

        if(list.contains(target))
        {
            System.out.println( target  + " is present in the list  " +list.indexOf(target));
        }

    }
}
