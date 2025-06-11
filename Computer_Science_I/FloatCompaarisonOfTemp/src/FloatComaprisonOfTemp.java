import java.util.Scanner;

public class FloatComaprisonOfTemp {
    public static void main(String[] args) throws Exception {
    
        Scanner inputScanner = new Scanner(System.in);
        double roomTemperature = 98.6;
        double threshold = 0.1;

        double bodyTemperatureA = inputScanner.nextDouble();

        if (Math.abs(bodyTemperatureA - roomTemperature ) < threshold){
            System.out.println("For all practical purposes they are considered equal");
        } else{
            System.out.println("They are unequal!");
        }
        }
    }

