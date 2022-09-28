package labs;

import java.util.Scanner;

public class Numbers {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1, num2, num3;

        System.out.println("Enter a number: ");
        num1 = scan.nextInt();
        System.out.println("Enter a number: ");
        num2 = scan.nextInt();
        System.out.println("Enter a number: ");
        num3 = scan.nextInt();

        double result = (double) (num1 * num2) / num3;

        int rounded = (int) (result + 0.5);

        System.out.println(
            "num1: " + num1 + "\n"+
            "num2: " + num2 + "\n"+
            "num3: " + num3 + "\n"+
            "result: " + result + "\n"+
            "rounded: " + rounded
        );
    }
}