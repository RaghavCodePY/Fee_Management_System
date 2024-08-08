package Fee_Management_System; // I make this in Fee_Management_System Package
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Fee Management System
        Scanner scn = new Scanner(System.in);
        System.out.print("What's your monthly fees: ");
        int fees = scn.nextInt();

        System.out.print("Days Absent: ");
        byte absents = scn.nextByte();

        int oneDay = fees/30;
        int giveFees = fees - (oneDay * absents);
        System.out.println("You need to pay ₹" + giveFees);
        scn.close();
    }
}