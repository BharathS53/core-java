public class College2{
    private String name;
    private String location;
    private  int strength;
    private  Student student2;

    public College2(String name,String location){
        this.name=name;
        this.location=location;
    }
    public College2(String name, String location, int strength){
    this(name, location);
    this.strength = strength;
}
    public void setStudent(Student student2){
        this.student2=student2;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getStrength(){
        return strength;
    }
    public Student getStudent2(){
        return student2;
    }
}
