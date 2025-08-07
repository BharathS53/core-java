class Company{
    //constructor chaining-one constructor calling from another using'this' 
    private String name;
    private long id;
    private String city;
    private int numberOfEmployee;
    //private String ceoname;
    //private  String ceocity;
    ///private  String ceosalary;
     private Ceo ceo;
    

    public Company(){

    }
    public Company(String name,long id){
        System.out.println("initializing name,id");
        this.name=name;
        this.id=id;
    }
    public Company(String  name,long id,String city){
        this(name,id);
        System.out.println("initializing city");
        this.city=city;
    }
    public Company(String  name,long id,String city,int employess){
        this(name,id,city);
        System.out.println("initializing employess");
        this.numberOfEmployee=employess;
    }
    public void setCeo(Ceo ceo){
        this.ceo=ceo;
    }
    public Ceo getCeo(){
        return ceo;
    }
    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }
    public String getCity(){
        return city;
    }
    public int getNumberOfEmployee(){
        return numberOfEmployee;
    }
}