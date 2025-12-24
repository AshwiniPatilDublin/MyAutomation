import java.util.Arrays;
import java.util.List;

public class StreamFirstelement {
    public static void main(String[] args) {
        List<Integer> ele = Arrays.asList(1,9,4,5,7);
        ele.stream()
                .filter(n->n>10)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("First element greater than 10 is" +ele);
    }
}
