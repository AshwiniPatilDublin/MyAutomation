public class PalindromeString {
    public static void main(String[] args) {
        String str = "ashu";
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");
    }
}
