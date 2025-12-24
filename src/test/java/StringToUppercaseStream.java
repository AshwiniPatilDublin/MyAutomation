import java.util.Arrays;
import java.util.List;

public class StringToUppercaseStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam","akash","ashu","sachu");
        names.stream().map(name->name.toUpperCase());

    }
}
