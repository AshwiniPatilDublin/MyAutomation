public class CountWords {
    public static void main(String[] args) {
        String str = "I love myself";
        String[] words = str.trim().split("\\s+");
        System.out.println("Words count is " + words.length);
    }
}




