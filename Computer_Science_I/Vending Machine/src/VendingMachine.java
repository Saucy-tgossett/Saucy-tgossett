import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) throws Exception {
        Scanner inputUserScanner = new Scanner(System.in); 

        System.out.print("Enter the code: ");
        int vendingMachineCode = inputUserScanner.nextInt();

        switch(vendingMachineCode){
            
            case 226:
            System.out.println("Here are your False Lashes");
            //break;

            case 227:
            System.out.println("Here is your Setting Powder");
            break;

            case 228:
            System.out.println("Here is your Finishing Powder");
            break;

            case 229:
            System.out.println("Here is your Eyeshadow Pallet");
            break;

            case 230:
            System.out.println("Here is your Setting Spray");
            break;

            case 231:
            System.out.println("Here is your Blush Stick");
            break;
            default:
                System.out.println("Invalid code please type in the right code");
        }

    }
}
