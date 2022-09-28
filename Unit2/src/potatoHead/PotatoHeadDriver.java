package potatoHead;

import java.util.Scanner;
import java.util.ArrayList;

public class PotatoHeadDriver {
    
    static ArrayList<PotatoHead> potatoHeads = new ArrayList<PotatoHead>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {

            System.out.println(
                "\nPick a number: \n"+
                "(1) New Potato Head \n"+
                "(2) Edit Potato Head \n"+
                "(3) View Potato Heads"
            );
  
            int selection = input.nextInt();

            if (selection == 1) {
                clearT();
                System.out.println("Enter a name or enter \"default\" to make a default Potato Head: ");
                String name = input.next();
                PotatoHead potatoHead = new PotatoHead();
                if (!(name.toLowerCase().equals("default"))) {
                    System.out.println("How many arms should "+name+" have? ");
                    int numArms = input.nextInt();
                    System.out.println("How many eyes should "+name+" have? ");
                    int numEyes = input.nextInt();
                    potatoHead.setName(name);
                    potatoHead.setArms(numArms);
                    potatoHead.setEyes(numEyes);
                }
                potatoHeads.add(potatoHead);
            }
            else if (selection == 2) {
                clearT();
                for (int i = 0; i < potatoHeads.size(); i++) {
                    String currPotatoHead = potatoHeads.get(i).getName();
                    System.out.println("("+(i+1)+") "+currPotatoHead);
                }
                System.out.println("Pick a Potato Head: ");
                int potatoHeadIndex = input.nextInt() - 1;
                System.out.println("Enter a new name: ");
                String name = input.next();
                System.out.println("How many arms should "+name+" have? ");
                int numArms = input.nextInt();
                System.out.println("How many eyes should "+name+" have? ");
                int numEyes = input.nextInt();
                PotatoHead currPotatoHead = potatoHeads.get(potatoHeadIndex);
                currPotatoHead.setName(name);
                currPotatoHead.setArms(numArms);
                currPotatoHead.setEyes(numEyes);
            }
            else if (selection == 3) {
                clearT();
                for (int i = 0; i < potatoHeads.size(); i++) {
                    System.out.println("\n"+potatoHeads.get(i));
                }
            }
        }
    }

    public static void clearT () {
        System.out.println("\033[H\033[2J");
    }
}
