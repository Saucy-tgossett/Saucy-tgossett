import java.util.Scanner;

public class LibraryFees {
public static void main(String[] args) throws Exception {
    // By: Tylar Gossett
    // Date: Sep.19.23
    Scanner inputUserScanner = new Scanner(System.in);
        
        int inputDaysLate;
        String inputVip;
        double due = 0.00;

    System.out.print("Enter the amount of days your book is overdue by: ");
        inputDaysLate = inputUserScanner.nextInt();

    System.out.print("Are you a VIP?(yes/no)");
        inputVip = inputUserScanner.next();


       //actual program logic 
        if ((inputVip.equalsIgnoreCase("yes")) && (inputDaysLate <= 5)) {
            due = .50;
        } else if((inputVip.equalsIgnoreCase("no")) && (inputDaysLate <= 5)) {
            due = 1.00;
        } else if((inputVip.equalsIgnoreCase("yes")) && (inputDaysLate >= 6) && (inputDaysLate <= 10 )) {
            due = 2.50;
        } else if((inputVip.equalsIgnoreCase("no")) && (inputDaysLate >= 6) && (inputDaysLate <= 10 )) {
            due = 5.00;
        } else if((inputVip.equalsIgnoreCase("yes")) && (inputDaysLate >= 10)) {
            due = 5.00;
        } else if((inputVip.equalsIgnoreCase("no")) && (inputDaysLate >= 10)) {
            due = 10.00;
        }

        System.out.println("Late fine $ " + due + " for " + inputDaysLate + " day's late");

        inputUserScanner.close();

    }
}
