import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) throws Exception {
        
        Scanner inputUser = new Scanner(System.in);

        System.out.println("When were you born: ");
        
        int birthDay = inputUser.nextInt();
        
        String birthMonth = inputUser.next();
        
        int birthYear = inputUser.nextInt();

        System.out.println(birthDay + birthMonth + birthYear );
        System.out.println("Day: " + birthDay);
        System.out.println("Month: " + birthMonth);
        System.out.println("Year: " + birthYear);

        inputUser.close();




        


    }
}
