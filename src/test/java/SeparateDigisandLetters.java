public class SeparateDigisandLetters {
    public static void main(String[] args) {
        String str = "Ashu0324Sachin66";

        String letters = "";
        String digits = "";
         for(int i = 0;i<str.length();i++)
         {
             char ch = str.charAt(i);
             if(Character.isLetter(ch)){
                 letters = letters+ch;
             }else if(Character.isDigit(ch))
             {
                 digits = digits+ch;
             }
         }
        System.out.println("Letters are :" +letters);
        System.out.println("Digits are :" +digits);
    }
}
