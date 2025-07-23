public class Bike {
        static String name="NS";
        static float price=20000;
        static String company="Bajaj";
        static float mileage=34.1f;
        static String colour="Black";
    public static void main(String []args){
       String Name=nameOfBike(); 
       float Price=priceOfBike();
       String Company=companyOfBike();
       float Mileage=mileageOfBike();
       String Colour=colourOfBike();
    
       System.out.println(Name);
       System.out.println(Price);
       System.out.println(Company);
       System.out.println(Mileage);
       System.out.println(Colour);
       
    }
    public static String nameOfBike(){
        return name;
    }
    public static float priceOfBike(){
        return price;
    }
    public static String companyOfBike(){
        return company;
    }
    public static float mileageOfBike(){
        return mileage;
    }
    public static String colourOfBike(){
        return colour;
    }
    
}