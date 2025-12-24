import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOfIntInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,8,3,2,4,6,9);
        num.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
