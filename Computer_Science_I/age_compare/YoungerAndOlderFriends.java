import java.util.Scanner;

public class YoungerAndOlderFriends {
    public static void main(String[] args) throws Exception {
        /*
         * By: Tylar Gossett
         * Date: Sep.15.23
         */
        
        Scanner inputScanner = new Scanner (System.in);

        System.out.println("What is your birthday?(imput format: year month day)");
        String inputYear = inputScanner.next();
        int inputYearInteger = Integer.parseInt(inputYear);
        String inputMonth = inputScanner.next();
        String inputDay = inputScanner.next();

        System.out.println("What is your friend's birthday?(imput format: year month day)");
        String inputFriendYear = inputScanner.next();
        int inputFriendYearInteger = Integer.parseInt(inputFriendYear);
        String inputFriendMonth = inputScanner.next();
        String inputFriendDay = inputScanner.next();

        boolean isYounger = inputYearInteger < inputFriendYearInteger;

        if(!isYounger){
            System.out.println("You are younger than your friend");
        }else if(inputYearInteger == inputFriendYearInteger){
            System.out.println("You are both the same age"); 
        }else {
            System.out.println("You are older than your friend");
        }
        
        inputScanner.close();


    }
}

