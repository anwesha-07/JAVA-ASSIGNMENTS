import java.util.*;

class LongestWord {

    String findLongest(String sentence) {

        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        LongestWord obj = new LongestWord();

        System.out.println("Longest Word: "
                + obj.findLongest(sentence));
    }
}
