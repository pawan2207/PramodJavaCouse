package Sep.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ip = sc.next().toCharArray()[0];


        switch (ip) {
            case ('a'):
                System.out.println("vowel");
                break;

            case('b'):
                System.out.println("vowel");
                break;
            default:
                System.out.println("outofrange");

        }




    }
}
