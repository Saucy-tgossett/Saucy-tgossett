public class Main {
    
    public static void main(String[] args) {
    //By: Tylar Gossett
    //Date: 11.27.23
    //Got help by Crystal

    //Creating the players
    Player mib = new Player("Jay",20);
    Player alien = new Player("Edgar the bug",5);

    //While health is over 0 it will loop through
    while((mib.getHealth() > 0) && (alien.getHealth() > 0)){
        
        //Prints out name + HP
        System.out.print(mib.toString() + "\t");
        System.out.println(alien.toString());

        //Makes them attack eachother
        mib.dealDamage(alien);
        alien.dealDamage(mib);

        //If statement to end loop when one of the players is dead
        if(alien.getHealth() <= 0){
            System.out.println("The alien has fallen you are the winner " + mib.toString());
        } else if (mib.getHealth() <= 0){
            System.out.println("You have fallen the winner is " + alien.toString());
        }
    }
        
}
}
