import java.util.*;

class UniqueChecker {

    boolean checkUnique(String str) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (set.contains(ch))
                return false;

            set.add(ch);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        UniqueChecker obj = new UniqueChecker();

        if (obj.checkUnique(str))
            System.out.println("All characters are unique.");
        else
            System.out.println("Duplicate characters found.");
    }
}
