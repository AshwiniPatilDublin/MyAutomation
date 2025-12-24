import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,7,8,7,9,3};

        List<Integer> list = new ArrayList<>();
        for(int num :arr)
        {
            list.add(num);
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Array without duplicates: " + set);

    }
}
