package Sep.learningfunctions;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class fun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int r = sum(num1, num2);
    }
        static int sum ( int num1, int num2){

            return num1 + num2;
        }


    }
