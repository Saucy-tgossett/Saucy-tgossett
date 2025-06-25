import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCount {
    //Tylar Gossett
    // Date: Oct.25.23
    
    public static void main(String[] args) throws Exception {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Please enter filename: ");
            String fileName = inputScanner.nextLine();

        System.out.print("What would you like to print to the file? ");
            String s = inputScanner.nextLine();

        File file = writeText(fileName, s);
        int wordsCounted = countWords(file);

        System.out.println(fileName + " contains " + wordsCounted + " word/words.");
        inputScanner.close();
    }
    
    /** 
     * Creates a file, writes provided string to file,returns File object 
     * *@param String fileName is the file created by the user 
     * *@param String s prints out the new file
     * *@throws IOException if the file name doesnt end with .txt
     * *@returns the new file created
     * */ 
    public static File writeText(String fileName, String s) throws IOException{ 
    
        if(!fileName.endsWith(".txt")){
            fileName = fileName + ".txt";
        }

        File file = new File(fileName);

        FileOutputStream fos = new FileOutputStream(fileName);
        PrintWriter outFS = new PrintWriter(fos);
        outFS.println(s);

        outFS.close();
    
        
        return file; 
    } 
    
    /** 
     *Counts number of words in file 
     *A word is any text separated by a whitespace 
     * *@param ??
     * *@throws file not found
     * *@return the number of words in the created file
     */ 
    public static int countWords(File file){ 
        
        try{
            FileInputStream fileData = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fileData);
            int wordNum = 0;

            while (fileScanner.hasNext()){
                fileScanner.next();
                wordNum++;
            }
            fileScanner.close();
            return wordNum;
        } catch (FileNotFoundException e){
            System.out.println("File Not Found.");
            return 0;
        }
    }
}

        

    
    

