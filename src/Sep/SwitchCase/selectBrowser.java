package Sep.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class selectBrowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name which you want to use");
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase(Locale.ROOT);
        System.out.println(browserName);

        switch (browserName){
            case ("chrome"):
                System.out.println("we will use chrome browser");
                break;
            case  ("edge"):
                System.out.println("we will use edge browser");
                break;

            case ("firefox"):
                System.out.println("we will use firefox browser");
                break;

            default:
                System.out.println("this is not recognized browser");
        }


    }
}
