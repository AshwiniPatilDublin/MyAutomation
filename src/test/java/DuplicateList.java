import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DuplicateList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,9,4,2,1,2,3,4);
        nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
