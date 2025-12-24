public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();
        String reversed = "";

        for(int i=str.length()-1;i>=0;i--)
        {
            reversed = reversed+str.charAt(i);
        }
        if(str.equals(reversed))
        {
            System.out.println("String is plaindrome");
        }
       else
            System.out.println("String is not plaindrome");
    }
}
