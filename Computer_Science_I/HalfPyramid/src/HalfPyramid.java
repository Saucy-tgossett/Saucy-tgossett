public class HalfPyramid {
    public static void main(String[] args) throws Exception {
        
        Scanner imputScnr = new Scanner(System.in);
        System.out.print("Imput the number of rows for inverted half pyramid: ");
        int rows = inputScnr.nextInt();
        

        //outer loop
        for (int i = 1; i <= rows; i++){

        //inner loop
        for (int j = 1; j <= rows; j++){
            System.out.print(j + " ");
        }
        System.out.println("");

        System.out.print("\n");
        System.out.println("");
        }
    }
public static void pyramidGenerator(int numOfRows){
    
    // outter loop
    for (int i = numOfRows; i >= 1; --i){

        // inner loop
        for(innt j = 1; j <= 1; ++j){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}

    
}

