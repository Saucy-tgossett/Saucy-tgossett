import java.util.Scanner;

public class IntelligentOven {
    public static void main(String[] args) throws Exception {
    
        Scanner inputUserScanner = new Scanner(System.in);
        
        String inputSugar;
        String inputIcing;

        System.out.print("Enter the input sugar quantity:");
        inputSugar = inputUserScanner.next();

        System.out.print("is icing added to the recipe(yes/no)")
        inputIcing = inputUserScanner.next();

       //input Validation
        boolean inputSugarValid = inputSugar.length() == 3;
        boolean isYesNOValid = inputIcing.equalsIgnoreCase("yes") || inputIcing.equalsIgnoreCase("no");
        
        //converting inputSugar to integers
        int inputSugarInteger = Integer.parseInt(inputSugar);
        
        if(inputSugarValid && isYesNOValid){

            //actual program logic 
            if((inputSugarInteger >= 100) && (inputSugarInteger < 200 ) && inputIcing.equalsIgnoreCase("yes")){
                System.out.println("Cake will need some sugar");
            
            }else if((inputSugarInteger >= 200) && (inputSugarInteger < 300 ) && inputIcing.equalsIgnoreCase("yes")){
                System.out.println("Cake will be ok");

            }else if((inputSugarInteger >= 300) && (inputSugarInteger < 400 ) && inputIcing.equalsIgnoreCase("yes")){
                System.out.println("Cake is SUPER sweet");

        }else
            System.out.println("Invalid inputs, please type in the right inputs");
        }


        inputUserScanner.close();
        

    }
}
