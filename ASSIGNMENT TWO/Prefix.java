class Prefix {

    String findPrefix(String[] arr) {

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.equals(""))
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] arr = {"dog", "flow", "car"};

        Prefix obj = new Prefix();

        System.out.println("Prefix = " + obj.findPrefix(arr));
    }
}
