public class Person {
    
    //Feilds
    private String name;
    private int age;
    private int ageMin = 0;
    private int ageMax = 100;



    //Constructor(s)

    public Person(String name, int age){
        this.name = name;
        this.age = age;


    }




    //Methods or behaviors

    public void setName(String name){
        this.name = name;

    }

    public void setAge(int age){
        if(age < ageMin){
            this.age = ageMin;
        } else if(age < ageMax){
            this.age = ageMax;
        } else {
            this.age = age;
        }
        
        this.age = age;

    }

    //Getters or accessors

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //overiding two string method 

    @Override
    public String toString(){
        return this.getName() + " : age " + this.getAge();
    }
}

