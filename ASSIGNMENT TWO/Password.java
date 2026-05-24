import java.util.*;

class Password {

    int check(String str) {

        if (str.length() < 4)
            return 0;

        if (Character.isDigit(str.charAt(0)))
            return 0;

        boolean cap = false, digit = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
                return 0;

            if (Character.isUpperCase(ch))
                cap = true;

            if (Character.isDigit(ch))
                digit = true;
        }

        if (cap && digit)
            return 1;

        return 0;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String str = sc.nextLine();

        Password obj = new Password();

        System.out.println(obj.check(str));
    }
}
