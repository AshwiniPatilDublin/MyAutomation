import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class CommonElementsbet2streams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,8,4,2);
        List<Integer> list2 = Arrays.asList(4,7,5,2);


        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(common);

    }
}
