import java.util.Scanner;

public class Swaptwonumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Numbers before swappig are : a = " + a + " and  b = " +b);
        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("Numbers before swappig are : a = " + a +  " and b = " +b);

    }
}
