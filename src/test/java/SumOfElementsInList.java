import java.util.Arrays;
import java.util.List;

public class SumOfElementsInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,8,3,5,9);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
