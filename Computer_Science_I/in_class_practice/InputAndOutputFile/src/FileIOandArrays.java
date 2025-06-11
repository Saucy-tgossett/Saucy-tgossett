import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOandArrays {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        // make sure you dont name your file something.txt bc then it puts .txt twice and wont be able to find the information 
        FileInputStream fileData = new FileInputStream("C:myFile.txt"); // Address of the folder copied so computer knows where to find the .txt file    
        // FileInputStream fileData = new FileInputStream("myFile.txt");
        Scanner inputScanner = new Scanner(fileData);
        
        //String data = inputScanner.next(); // can make int for int type data
        //System.out.print("This is your data: " + data);
        while(inputScanner.hasNext()){
            String data = inputScanner.nextLine(); // can make String for String type data
            System.out.println("This is your data: " + data);
        }
        
        fileData.close();
        inputScanner.close();


    }
}
