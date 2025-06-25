public class TreasureHunt {
    public static void main(String[] args) throws Exception {
        //By: Tylar Gossett
        //Date: 11.8.23
        
        // treasure map
        char[][] treasureMap = {
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '+', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
        };

        // Calls method to check treasureMap
        getCoordinates(treasureMap);
    } 

    /**
     * Prints the row and column of the '+' sign given a 2D character array
     * @param map is a 2D Array
     */
    public static void getCoordinates(char[][] map) {

        // For loop to run through each row an find the +
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '+') {
                    System.out.println("Start digging in row " + i + ", " + "coulmn " + j);
                }
            }
        }

    }
}

