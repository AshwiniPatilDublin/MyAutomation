public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "I LOVE MY INDIA";
        str = str.replaceAll("\\s+","");
        System.out.println("After removing spaces " +str);
    }
}
