public class VowelsandConsonants {
    public static void main(String[] args) {
        String str = "Helloworld";
        str = str.toLowerCase();

        String vowels = "";
        String consonants = "";

       for(int i =0;i<str.length();i++)
       {
           char c = str.charAt(i);
           if(Character.isLetter(c))
           {
               if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
               {
                   vowels = vowels+c;

               }else
                   consonants = consonants+c;
           }
       }
        System.out.println("Vowels are :" + vowels);
        System.out.println("Consonants are :" + consonants);
    }
}

