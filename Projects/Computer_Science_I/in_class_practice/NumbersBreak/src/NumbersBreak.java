public class NumbersBreak {
    public static void main(String[] args) throws Exception {
        
        int i = 0;

        while(i < 10){

            if (i % 2 == 0 ){
                continue;
            } 

            System.out.println(i);

            i++;
        }
    }
}
