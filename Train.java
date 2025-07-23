class Train{
    private String name;
    private int cost;
    private int speed;

    public static int length;
    static{
        System.out.println("Static block in train");
        length=100;
    }
    {
        System.out.println("non static block in train");
        length=200;
    }
    public void setname(String trainName){
        name=trainName;
    }
    public void setcost(String trainCost){
        name=trainCost;
    }
    public void setspeed(String trainSpeed){
        name=trainSpeed;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getSpeed(){
        return speed;
    }
}