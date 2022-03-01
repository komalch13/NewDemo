public class TestCase11ReverseaString {
    //Entry condition- is length of the string
    //Actual Logic
/*    //Exit condition- when length reaches its max value

    public static String reverse(String word) {
        if (word.length() < 1) {
            return word;

        }
        String reverseWord = " ";

        for (int i = word.length() - 1; i >= 0; i--) {
            char character = word.charAt(i);// get word/character, we extracted character from string
            reverseWord = reverseWord + String.valueOf(character); // we kept on adding the word to reverse string
        }

        System.out.println(reverseWord);

        return "";
    }

    public static void main(String[] args) {
        reverse("KOMAL");

    }*/

   /* public static String reverseString(String word){
        if(word.length()<1){
            return word;
        }

        String reverseword= "";

        for(int i=word.length()-1; i>=0; i--){
            char ch= word.charAt(i);
            reverseword= reverseword+ String.valueOf(ch);
        }

        System.out.println(reverseword);

        return"";
    }

    public static void main(String[] args) {
        reverseString("KOMAL CHHABRA");
    }*/

    public static String reverse(String word) {
        if (word.length() < 1) {
            return word;
        }


        String reverword = "";

        for (
                int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            reverword = reverword + String.valueOf(ch);

        }

        System.out.println(reverword);

        return "";

    }

    public static void main(String[] args) {
        reverse("Alpha");
    }
}










