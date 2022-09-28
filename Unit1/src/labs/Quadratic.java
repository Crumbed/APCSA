package labs;

import java.util.Scanner;

public class Quadratic {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int a, b, c;
        
        System.out.println("Enter a number: ");
        a = scan.nextInt();
        System.out.println("Enter a number: ");
        b = scan.nextInt();
        System.out.println("Enter a number: ");
        c = scan.nextInt();

        System.out.println("Your equation: "+a+"^2 + "+b+"x + "+c);

        double discVal = Math.pow(b, 2) - 4*a*c;
        double posRoot = -b-1 + Math.sqrt(discVal) / 2 * a;
        double negRoot = -b-1 - Math.sqrt(discVal) / 2 * a;

        System.out.println(
            "Discriminant Value is "+discVal+"\n"+
            "Roots are real and can be calculated\n"+
            "Positive root: "+posRoot+"\n"+
            "Negative root: "+negRoot
        );

    }
}