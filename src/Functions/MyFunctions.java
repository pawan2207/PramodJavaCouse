package Functions;

public class MyFunctions {
    public static void main(String[] args) {
        greetMe();
        sum();
        sums(3,6);
    }

    static void greetMe(){
        System.out.println("Hello how are you?");
    }

static void sum(){
        int a = 10;
        int b = 20;
    System.out.println("sum of two no is "+(a+b));
}

static void sums(int a,int b){
int e=a+b;
    System.out.printf("sum of two no is %d",e);
}
}
