public class SplitSentances {
    public static void main(String[] args) throws Exception {
        
        // Seprate "Person A/B:" from sentance

        String sentanceA = " Bobby: hi how are you?";
        String sentanceB = " Elliot: I am fine? How are you";

        //String [] sentances = sentanceB.split(":");

        //System.out.println(sentances.length);

        //System.out.println(sentances[1].trim());

        // Seprate "." from sentance

        //String [] sentancess = sentanceB.split("[?]",0); //https://www.tutorialspoint.com/split-string-with-dot-in-java#:~:text=To%20split%20a%20string%20with,%5B.%5D%22%2C%200)%3B

        //for(String sentanceB: sentancess) {
        //    System.out.println(sentancess);
    //}

    String str = "Elliot: I am fine. How are you? u ok."; 
    String[] res = str.split("[.:?]+", 0);//https://stackoverflow.com/questions/58778931/spliting-a-string-by-space-and-dot-and-comma-at-the-same-time
        for(String myStr: res) {
        System.out.println(myStr);

    }
}
}