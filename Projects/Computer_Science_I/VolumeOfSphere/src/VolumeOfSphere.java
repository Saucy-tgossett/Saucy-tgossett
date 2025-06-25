import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) throws Exception {
        
        /*By: Tylar Gosset
         * Date: 9/7/23
         */

        //varibale declaration(creating a variable or locker)
        double fraction;
        double pi;
        int radius;

        //Assiging values to the declared variables
        fraction = 4.0 / 3.0;
        pi = 3.14;
        radius = 3;


        System.out.printf("%.2f", fraction * pi * radius * radius * radius);

    }
}
