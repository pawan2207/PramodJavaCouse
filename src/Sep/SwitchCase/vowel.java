package Sep.SwitchCase;

public class vowel {
    public static void main(String[] args) {
        char val = 'A';

        switch (val){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("nots vowels");
        }

    }
}
