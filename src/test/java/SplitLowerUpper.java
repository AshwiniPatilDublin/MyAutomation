public class SplitLowerUpper {
    public static void main(String[] args) {

        String str = "aAbBcCdDeE";
        String lower = "";
        String upper = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                lower = lower + c;
            } else if (Character.isUpperCase(c)) {
                upper = upper + c;
            }
        }
            System.out.println("Lower case output :" +lower);
            System.out.println("Upper case output :" +upper);
        }
    }

