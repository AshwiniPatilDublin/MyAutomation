public class StringRotation {
    public static void main(String[] args)
    {
        String s1 = "abcde";
        String s2 = "cdeab";

        if(s1.length() == s2.length() && (s1+s1).contains(s2))

            System.out.println("Strings are rotations of each other");
            else
            {

                System.out.println("Not rotations");
            }
        }
    }

