public class PetAnimals {
    private String name;
    private int  age;

    public PetAnimals(){
        System.out.println("no arguments block");
        this.name="cat";
        this.age=4;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}
