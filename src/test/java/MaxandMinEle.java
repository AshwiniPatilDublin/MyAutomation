import java.util.Arrays;
import java.util.List;

public class MaxandMinEle {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,3,23,89,45);
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();

        System.out.println("Max: " + max + ", Min: " + min);

    }
}
