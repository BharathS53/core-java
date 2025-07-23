public class Dog {
    private String breed;
    private String colour;
    private int vaccine;

    public static int age;
    static{
        System.out.println("static block in Dog");
        age=3;
    }
    {
        System.out.println("non static block in dog");
        age=5;
    }
    public void setbreed(String dogBreed){
        breed=dogBreed;
    }
    public void setcolour(String dogColour){
        colour=dogColour;
    }
    public void setvaccine(int dogVaccine){
        vaccine=dogVaccine;
    }
    public String getbreed(){
        return breed;
    }
    public String getcolour(){
        return colour;
    }
    public int getvaccine(){
        return vaccine;
    }
}
