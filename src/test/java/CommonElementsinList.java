import java.util.Arrays;
import java.util.List;

public class CommonElementsinList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,7,2,3,4,7);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);

        list1.retainAll(list2);
        System.out.println("Common elements are :" +list1);


    }
}
