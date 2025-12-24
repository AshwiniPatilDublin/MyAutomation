import java.util.ArrayList;

public class ListArrayExample
{
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
         list.add("Ashwini");
         list.add("Sachin");
         list.add("India");

         String firstName = list.get(0);
        String LastName = list.get(list.size()-1);

        System.out.println("First Element: " + firstName);
        System.out.println("Last Element: " +LastName);

    }
}
