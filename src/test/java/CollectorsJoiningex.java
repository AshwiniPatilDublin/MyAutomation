import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashu","Sachu","Lion");
        names.stream().collect(Collectors.joining(","));
        System.out.println(names);
    }
}
