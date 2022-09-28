package labs;

import java.util.Scanner;

public class Distance {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int x1, y1, x2, y2;

        System.out.println("Enter x1: ");
        x1 = scan.nextInt();
        System.out.println("Enter y1: ");
        y1 = scan.nextInt();
        System.out.println("Enter x2: ");
        x2 = scan.nextInt();
        System.out.println("Enter y2: ");
        y2 = scan.nextInt();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.print(
            "The first point is: ("+x1+","+y1+")\n"+
            "The second point is: ("+x2+","+y2+")\n"+
            "The Distance between the points is "+distance+"."
        );
    }
}