public class InnerAndOutterLoop {
    public static void main(String[] args) throws Exception {
        
        int weeks = 3;
        int days = 7;

        //outerloop prints out week
        for (int i = 1; i <= weeks; ++i){
            System.out.println("Week: " + i);

        //innerloop prints out days 
        for (int j = 1; j <= days; ++j){
            System.out.println(" Day: " + j);
        }
        }
    }
}
