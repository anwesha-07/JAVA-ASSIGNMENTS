import java.util.*;

class Permutation {

    void permute(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i)
                    + str.substring(i + 1);

            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        Permutation obj = new Permutation();

        obj.permute(str, "");
    }
}
