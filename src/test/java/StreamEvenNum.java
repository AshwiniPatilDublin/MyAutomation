import java.util.Arrays;
import java.util.List;

public class StreamEvenNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,8,2,3,4,6,5,7);
         num.stream().filter(n->n%2==0)
                 .forEach(System.out::println);
    }
}
