public class PrintEvenIndexedChar {
    public static void main(String[] args) {
        String str = "JavaAutomation";

        for(int i =0 ;i <str.length();i++)
        {
            if(i%2==0)
            {
                System.out.println("Characters at even index :"  +i+ ":" +str.charAt(i));
            }
        }
    }
}