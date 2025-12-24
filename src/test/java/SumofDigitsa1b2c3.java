public class SumofDigitsa1b2c3 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for(char c :str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sum = sum+Character.getNumericValue(c);
            }
            System.out.println("Sum of the digits :" +sum);
        }
    }
}
