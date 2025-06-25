import java.io.*;
import java.util.*;

public class Parser {

    private ArrayList<String> sentences;

    public Parser() {
        sentences = new ArrayList<>();
    }

    public void parseFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                // remove Person A/Person B from sentences
                line = line.replaceFirst("^(Person A:|Person B:)", "").trim();

                // separate sentences (anything ending with ?/. to individual lines)
                String[] sentencesArray = line.split("[.?!]");
                for (String sentence : sentencesArray) {
                    sentence = sentence.trim();
                    if (!sentence.isEmpty()) {
                        sentences.add(sentence);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    // get a list of sentences (without Person A/B)
    public ArrayList<String> getSentences() {
        return sentences;
    }

}

