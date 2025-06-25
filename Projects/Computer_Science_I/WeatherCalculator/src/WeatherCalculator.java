import java.util.Scanner;

public class WeatherCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompts the user for the number of days they want averaged
        System.out.print("Enter the number of days: ");
        int days = inputScanner.nextInt();

        // Createing the array
        int[] morningTemps = new int[days];
        int[] noonTemps = new int[days];
        int[] nightTemps = new int[days];

        // Prompts the user for the temperature data for each day
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1));
            System.out.print("Morning temperature: ");
            morningTemps[i] = inputScanner.nextInt();
            System.out.print("Noon temperature: ");
            noonTemps[i] = inputScanner.nextInt();
            System.out.print("Night temperature: ");
            nightTemps[i] = inputScanner.nextInt();
        }
        
        // Calculating and displaying average temperature for each day
        
        // Outprinting the Average Report
        System.out.println("\n----Average Report----");
        
        for (int i = 0; i < days; i++) {
            int avgTemp = (morningTemps[i] + noonTemps[i] + nightTemps[i]) / 3;
            System.out.println("Day " + (i + 1) + " average is: " + avgTemp);
        }

        // Calculate and display average temperature at morning, noon, and night across all days
        int totalMorningTemp = 0;
        int totalNoonTemp = 0;
        int totalNightTemp = 0;
        
        for (int i = 0; i < days; i++) {
            totalMorningTemp += morningTemps[i];
            totalNoonTemp += noonTemps[i];
            totalNightTemp += nightTemps[i];
        }
        
        int avgMorningTemp = totalMorningTemp / days;
        int avgNoonTemp = totalNoonTemp / days;
        int avgNightTemp = totalNightTemp / days;

        System.out.println("Morning average for all days: " + avgMorningTemp );
        System.out.println("Noon average for all days: " + avgNoonTemp);
        System.out.println("NIght average for all days: " + avgNightTemp);
        
        inputScanner.close();
        
    }
}



