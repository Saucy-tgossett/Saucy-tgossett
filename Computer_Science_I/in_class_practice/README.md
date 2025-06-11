package Assignments;
import java.util.Scanner;

public class GradePredictor {
    public static void main(String[] args) throws Exception {
        //By: Tylar Gossett
        //Date: 9.20.23
        
        Scanner inputScanner = new Scanner (System.in);

        System.out.print("Enter your grade in numbers for midterm: ");
        int inputMidterm = inputScanner.nextInt();


        System.out.print("Enter your grade in numbers for final exam: ");
        int inputFinalExam = inputScanner.nextInt(); 
        

        System.out.print("Did you answer ALL of the challenge problems on Zybooks(Yes/No): ");
        String inputZybookYesNo = inputScanner.next(); 
        
        if ((inputMidterm > 80 ) && (inputFinalExam > 80) && (inputZybookYesNo.equalsIgnoreCase("yes"))) {
            System.out.println("You will get an A grade!");
        } 
        else {
            System.out.println("You will not get an A grade. :( ");

            inputScanner.close();
        }
        
    }     
}

