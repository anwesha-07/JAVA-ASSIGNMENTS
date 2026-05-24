import java.util.*;

class Profanity {

    String filterText(String text) {

        String[] badWords = {"bad", "ugly", "stupid"};

        for (String word : badWords) {
            text = text.replaceAll(word, "***");
        }

        return text;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Profanity obj = new Profanity();

        System.out.println("Filtered Text: "
                + obj.filterText(text));
    }
}