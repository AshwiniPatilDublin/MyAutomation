public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words  =str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word :words)
        {
            sb.append(new StringBuilder(word).reverse()).append(" ");

        }
        System.out.println("Reversed words: " + sb.toString().trim());

    }
}



