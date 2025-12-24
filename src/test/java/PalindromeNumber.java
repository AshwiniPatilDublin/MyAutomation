public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 153, temp = n, result = 0;

        while(temp!=0)
        {
            int digit = n%10;
           //rev = rev*10+temp%10;
            result = result+digit+digit+digit;
            temp = temp/10;
        }
        if(result ==n)
        {
            System.out.println("Amstrong");
        }
        else
            System.out.println("not amstrong");

    }
}
