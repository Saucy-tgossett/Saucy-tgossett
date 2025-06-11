public class MultiplyAndVerify {
    public static void main(String[] args) throws Exception {
        double num = 10.0;

        double newNum = divide(num);

        System.out.println(newNum);

    }

    public static double divide (double num) {
        
        num = num / 2;


        return num;
    }
}
