import java.util.Scanner;

public class MultTableRehash {
// By: Tylar Gossett
// Date: Oct.13.23
    
    /*
     * verifies int num making sure its between 0 and 50 
     * @param num is the number of rows and columns in the table 
     * @return num is being returned after its verification
     */

    public static boolean verifyNum(int userNum) {
        return ((userNum > 0) && (userNum < 50));
    } 

    /*
     * prints a multiplication table
     * @param num is the number of rows and columns in the table 
     */
    
    
    public static void printTable(int userNum){
            System.out.println("\nMultiplication Table for " + userNum + ":");
        
            for (int i = 1; i <= userNum; i++) {
                for (int j = 1; j <= userNum; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner inputScnr = new Scanner(System.in);
        int userNum = inputScnr.nextInt();

        if (verifyNum(userNum)) {
            printTable(userNum);
        } else {
            System.out.println("Invalid input: Please enter a number between 0 and 50.");
        }
        inputScnr.close();
    
    }
}
