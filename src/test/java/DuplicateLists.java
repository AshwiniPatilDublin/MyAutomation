import java.util.*;

public class DuplicateLists {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //List<Integer> lists = Arrays.asList(1,7,3,2,1,3,2);
       // Collections.reverse(lists);
       // System.out.println(lists);
        //HashSet<Integer> sets = new HashSet<>(lists);
       // System.out.println("Duplicate elements are :" +sets);

    }
}
