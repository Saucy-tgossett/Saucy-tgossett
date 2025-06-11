import java.util.Scanner;

public class 2D-Array {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of catacombe 5-10 -  ");
        int rows = scan.nextInt();
        int columns = rows;

        int[][] gameBoard = new int[rows][columns];
        boolean[][] heroLocation = new boolean[rows][columns];


        // Now you can use the array like a regular
        // 2-dimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gameBoard[i][j]= (i + 1) + (j + 1);
                heroLocation[0][0] = true;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(gameBoard[i][j] +" \t" );
            }

            System.out.println();
        }
        scan.close();
    }
    }


