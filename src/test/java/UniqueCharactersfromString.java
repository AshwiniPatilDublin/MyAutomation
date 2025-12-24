public class UniqueCharactersfromString {

        public static void main(String[] args) {
            String str = "programming";
            System.out.println("Input String: " + str);

            System.out.print("Unique Characters: ");
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // check if the current char appears only once
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    System.out.print(ch + " ");
                }
            }
        }
    }


