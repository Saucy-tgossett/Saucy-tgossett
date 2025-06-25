public class Classifier {
    public static String classifySentence(String sentence) {
        sentence = sentence.trim(); // get sentence list from parser

        if (sentence.contains("what") || sentence.contains("which") || sentence.contains("how") || sentence.contains("hows") || sentence.contains("where")) {
            return "? - OPEN-ENDED QUESTION";
        } else if (sentence.contains("are you")) {
            return "? - CLOSE-ENDED QUESTION";
        } else {
            return ". - STATEMENT";
        }
    }
}
