import java.util.Scanner;

public class UpTo100 {
    public static void main(String[] args) throws Exception {
        // By: Tylar Gossett
        // Date: Sep.27.23
        
        Scanner inputScnr = new Scanner (System.in);
        
        int sum = 0;
        int numOfEntries = 0;

        while (sum <= 100){
            System.out.print("Enter a number: ");
            sum = sum + inputScnr.nextInt();
            
            numOfEntries++;
        }
            numOfEntries = numOfEntries - 1;

        

        if (numOfEntries == 1){
            System.out.println("You entered " + numOfEntries + " number before the total was greater than 100" );
        } else {
            System.out.println("You entered " + numOfEntries + " numbers before the total was greater than 100" );
        }
        

        inputScnr.close();



    }
}
