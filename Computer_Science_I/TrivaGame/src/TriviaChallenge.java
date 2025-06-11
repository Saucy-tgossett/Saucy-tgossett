import java.util.Scanner;

public class TriviaChallenge {
    /* By: Tylar Gossett
     * Date: Sep.26.23
     */
    public static void main(String[] args) throws Exception {
        Scanner inputUserScanner = new Scanner(System.in);
        
        // Triva introduction
        System.out.println("Welcome to Serial Killer Triva! [*v*]");
        
        // Variable initialization
        int numOfCorrectAns = 0;
        

        // Question 1 - Integer  
            System.out.print("How many people did H.H Holmes confess to murdering? "); // Answer = 28
                int numPeople = inputUserScanner.nextInt();
                inputUserScanner.nextLine();
            
            if (numPeople == 28){
                System.out.println("Correct! [*v*]");
                numOfCorrectAns++;
            } else {
                System.out.println("Incorrect [*^*]");
            }

        // Question 2 - String 
            System.out.print("Who was the first serial killer in the United States? ");
                String firstSerialKiller = inputUserScanner.nextLine().trim();

            if  (firstSerialKiller.equalsIgnoreCase("H.H. Holmes")){
                System.out.println("Correct! [*v*]"); 
                numOfCorrectAns++;
            } else {
                System.out.println("Incorrect [*^*]");
            }

        // Question 3 - True or False
            System.out.println("True or False: You will walk past 36 murders in your lifetime. ");
                String walkPastMurders = inputUserScanner.next();

            if (walkPastMurders.equalsIgnoreCase("True")) {
                System.out.println("Correct! [*v*]");
                numOfCorrectAns++;
            } else {
                System.out.println("Incorrect [*^*]");
            }

        // Question 4 - Double 
            System.out.println("How much does a serial killer make per hour?");
                double numPerHour = inputUserScanner.nextDouble();

            if (numPerHour == 16.88){
                System.out.println("Correct! [*v*]");
                numOfCorrectAns++;  
            } else {
                System.out.println("Incorrect [*^*]");
            }

        // Question 5 - Single Character
            System.out.println("What is the first letter of the serial killers name who killed and ate people? "); // Anser = J
                String firstLetterOfName = inputUserScanner.next();

            if (firstLetterOfName.equalsIgnoreCase("J")) {
                System.out.println("Correct! [*v*]"); 
                numOfCorrectAns++; 
            } else {
                System.out.println("Incorrect [*^*]");
            }

        // Trivia Results
            if (numOfCorrectAns == 5){
                System.out.println("Congradulations you got 5/5 correct, FOR A SCORE OF 100%");
            }else if (numOfCorrectAns == 4){
                System.out.println("You got 4/5 correct, for a score of 80% ");
            }else if(numOfCorrectAns == 3){
                System.out.println("You got 3/5 correct, for a score of 60% ");
            }else if(numOfCorrectAns == 2){
                System.out.println("You got 2/5 correct, for a score of 40% ");
            }else if(numOfCorrectAns == 1){
                System.out.println("You got 1/5 correct, for a score of 20% ");
            }else if(numOfCorrectAns == 0){
                System.out.println("You got 0/5 correct, for a score of 0% ");
            }
            
            inputUserScanner.close();
        }
        
    }
