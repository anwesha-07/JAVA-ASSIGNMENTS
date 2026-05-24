import java.util.*;

class TitleCase {

    String convert(String sentence) {

        String[] words = sentence.split(" ");

        String result = "";

        for (String word : words) {

            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        TitleCase obj = new TitleCase();

        System.out.println("Title Case: "
                + obj.convert(sentence));
    }
}
