import java.util.*;

// made by: Tylar Gossett and Sidra Ali

public class AnalysisAgent {

    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.parseFile("input.txt"); // read file in parser class

        ArrayList<String> sentences = parser.getSentences(); // get sentences from parser class

        for (String sentence : sentences) {
            String classification = Classifier.classifySentence(sentence);
            System.out.println(sentence + classification);
        }
    }

}
