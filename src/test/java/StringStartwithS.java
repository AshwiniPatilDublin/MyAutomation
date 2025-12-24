import java.util.Arrays;
import java.util.List;

public class StringStartwithS {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam","Ash","Sachu","Soumya");
        names.stream().filter(name->name.startsWith("S"))
                .forEach(System.out::println);
    }
}
