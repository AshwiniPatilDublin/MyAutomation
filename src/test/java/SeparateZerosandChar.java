public class SeparateZerosandChar {
    public static void main(String[] args) {
        String str = "32400121200";

        String zeros = "";
        String nonZeros = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '0') {
                zeros = zeros + ch;

            } else {
                nonZeros = nonZeros + ch;
            }
        }
        String result = nonZeros+zeros; // combine zeros + other digits
        System.out.println("Input String: " + str);
        System.out.println("Output String: " + result);
    }
}