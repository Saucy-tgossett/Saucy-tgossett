import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) throws Exception {
        // By: Tylar Gossett
        // Date: Nov.7.23

        // Initializing variable
        int points = 0;
        
        // ArrayList Code
        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> uniqueWords = new ArrayList<>();

        ArrayList<String> correctGuesses = new ArrayList<>();

        ArrayList<Character> gameLetters = new ArrayList<>();

        ArrayList<String> userInputList = new ArrayList<>();

        // Pulling data out of file
        System.out.println(System.getProperty("user.dir"));

        FileInputStream fileData = new FileInputStream("word.txt");

        Scanner inputScanner = new Scanner(fileData);

        // Game introduction
        System.out.println("Welcome to the game!");

        // Game setup (gets words,shuffles list, and checks length)
        while (inputScanner.hasNext()) {
            list.add(inputScanner.next());
        }

        for (String s : list) { // Makes it so only words above 4 letters and with unique characters print out

            if (s.length() >= 7) {
                if (checkLength(s)) {
                    uniqueWords.add(s);

                    Collections.shuffle(list); // Shuffles list
                }

            }

            inputScanner.close();
        }

        // Outprints the random word and scrambles it
        String t = uniqueWords.get(5);
        scrambleWord(t);

       // ArrayList<Character> gameLetters = new ArrayList<>();
        for (char c : t.toCharArray()) {
            gameLetters.add(c);
        }

        // Creates room for userInput and adds up the points

        Scanner userInput = new Scanner(System.in);

        while (true) {

            System.out.print("\n");
            String userGuess = userInput.next();

            if (userGuess.equalsIgnoreCase("mix")) { // Scrambles the words again
                scrambleWord(t);

            } else if (userGuess.equalsIgnoreCase("ls")) { // Shows list of vaild words inputed

                for (String object: userInputList) {
                    System.out.println( " " + object);
                }
            

            } else if (userGuess.equalsIgnoreCase("bye")) { // Ends program
                System.out.println("\nFinal Score: " + points);
                System.out.println("See ya!");
                
                userInput.close();
                System.exit(0);

            } else { // Adds up points for vaild words + Checks for already entered words

                if (list.contains(userGuess)) {

                    boolean containedInLetters = true;
                    for (char c : userGuess.toCharArray()) {
                        if (!gameLetters.contains(c)) {
                            containedInLetters = false;
                            break;
                        }
                    }
                    if (containedInLetters) {

                        if (!correctGuesses.contains(userGuess)) {
                            correctGuesses.add(userGuess);

                            if (userGuess.length() == 4) { // How to make it count char
                                points++; // Adds to the score integer value
                                userInputList.add(userGuess);

                            } else if (userGuess.length() > 4) {
                                points += userGuess.length();
                                userInputList.add(userGuess);
                            }
                        }
                    }

                }
            }

            System.out.print("\nScore: " + points); // Outprints the users score

        }
    }

    /*
     * Checks length of words in word.txt
     * @param checkLenght Checks the length of words
     * @returns true if the lenght is right and if all letters are unique
     */
    public static boolean checkLength(String word) {
        ArrayList<Character> set = new ArrayList<>();

        for (char c : word.toCharArray()) {

            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    /*
     * Scrambles randomly picked word 
     * @param uniqueWord is the random word picked from word.txt that is unique and
     * 7 letters
     * @returns scrambled word + spacing
     */
    public static void scrambleWord(String uniqueWord) {

        ArrayList<Character> letters = new ArrayList<>();

        int i;

        for (i = 0; i < uniqueWord.length(); i++) {
            letters.add(uniqueWord.charAt(i));
        }
        Collections.shuffle(letters);

        for (Character l : letters) {
            System.out.print(l + "\t");
        }

    }
}
