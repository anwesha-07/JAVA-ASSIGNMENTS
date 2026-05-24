import java.util.*;

class DomainExtractor {

    String extractDomain(String url) {

        url = url.replace("https://", "");
        url = url.replace("http://", "");
        url = url.replace("www.", "");

        int slashIndex = url.indexOf('/');

        if (slashIndex != -1) {
            url = url.substring(0, slashIndex);
        }

        return url;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        DomainExtractor obj = new DomainExtractor();

        System.out.println("Domain: "
                + obj.extractDomain(url));
    }
}
