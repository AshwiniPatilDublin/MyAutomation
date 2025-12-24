public class PrintCharDouble {
    public static void main(String[] args) {
        String str = "Hello Ashwini";
        StringBuilder sb = new StringBuilder();
        System.out.println("Characters before doubling");
       for(int i = 0;i<str.length();i++){
           char ch = str.charAt(i);
           sb.append(ch).append(ch);
       }
        System.out.println(sb.toString());

       }
    }