package Sep.Constructor;


class homePage {
    String url;
    String para;
    int urlCount;

    homePage(String url) {
        System.out.println(url);

    }

}

public class ParamConstructor {

    public static void main(String[] args) {
        String url = "https://google.com";
        homePage h = new homePage(url);

    }

}
