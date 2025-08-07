public class Car1 {
    private String name;
    private int speed;
    private String color;
    private String fuelType;
    private int rpm;

    public Car1(String name){
        this.name=name;
        System.out.println("initializing name");
    }
    public Car1(String name,int speed){
        this(name);
        System.out.println("initializing speed");
        this.speed=speed;
    }
    public Car1(String name,int speed,String color){
        this(name,speed);
        System.out.println("initializing  color");
        this.color=color;
    }
    public Car1(String name,int speed,String color,String fuelType){
        this(name,speed,color);
        System.out.println("initializing fueltype");
        this.fuelType=fuelType;
    }
    public Car1(String name,int speed,String color,String fuelType,int rpm){
        this(name,speed,color,fuelType);
        System.out.println("initializing rpm");
        this.rpm=rpm;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }
    public String getFuelType(){
        return fuelType;
    }
    public int getRpm(){
        return rpm;
    }
}
