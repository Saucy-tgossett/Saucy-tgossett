import java.util.Scanner;

public class PrintAnX {
    public static void main(String[] args) throws Exception {
        //By: Tylar Gossett
        //Date: Oct.4.23
        
        Scanner inputScnr = new Scanner(System.in);
        
            System.out.println("What is the value of n: ");
            int userNum = inputScnr.nextInt();
        
        if ((userNum > 3) && (userNum % 2 != 0 )) {
        
            for (int x = 0; x < userNum; x++) {
                for (int y = 0; y < userNum; y++) {
                    if (y == x || userNum - y == x + 1) {
                System.out.print("*");
                    } else {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
        } else {
            System.out.println("Error: n must be an odd number and greater than 3");
        }

    inputScnr.close();
    }
}



