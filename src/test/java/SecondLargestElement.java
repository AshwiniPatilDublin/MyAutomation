import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,90,30,20,40,50);
       int second =  nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(second);

    }
}
