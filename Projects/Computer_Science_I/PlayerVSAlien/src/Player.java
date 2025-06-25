import java.util.Random;

public class Player {
    //By: Tylar Gossett
    //Date: 11.22.23
    //Got help by Crystal
    
    //!New Random
    public Random rand = new Random();
    
    //!Feilds
    private String name;
    private int health;
    private int maxDamage;
    

    //!Constructor(s)
    public Player(String name, int maxDamage){
        this.name = name;
        this.health = 100;
        this.maxDamage = maxDamage;
    }


    //!Methods or behaviors

    /**
     * Sets name 
     * @param newName
     */
    public void setName(String newName){
        this.name = newName;

    }

    /**
     * Sets health
     * @param newHealth
     */
    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    /**
     * Sets max damage 
     * @param newMaxDamage
     */
    public void setMaxDamage(int newMaxDamage){
        this.maxDamage = newMaxDamage;
    }

    //!Getters or accessors

    /**
     * Useses getName and returns name
     * @return this.name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Useses getHealth and returnss health
     * @return this.health
     */
    public int getHealth(){
        return this.health;
    }

    /**
     * Usese getMaxDamage and returns max damage
     * @return this.maxDamage
     */
    public int getMaxDamage(){
        return this.maxDamage;
    }

    /**
     * Deals damage to players
     * @param casualty 
     */
    public void dealDamage(Player casualty){
        int damage = rand.nextInt(this.maxDamage);
        casualty.setHealth(casualty.getHealth() - damage);
    }
    
    
    /**
     * Outprints the name and health points of an instance
     * @return name: HP getHealth 
     * @overide overides the default strings
     */
    @Override
    public String toString(){
        return this.getName() + " : HP " + this.getHealth();
    }


}
