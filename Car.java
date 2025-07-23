public class Car {
    static String name="breeza";
    static String brand="suzuki";
    static float mileage=15;
    static String colour="red";

    public static void main(String[] args) {
        String Name=nameOfCar();
        String Brand=nameOfBrand();
        float Mileage=mileageOfCar();
        String Colour=colourOfCar();  
        System.out.println(Name);
        System.out.println(Brand);
        System.out.println(Mileage);
        System.out.println(Colour);
    }
    
    public static String nameOfCar(){
        return name;
    }
    public static String nameOfBrand(){
        return brand;
    }
    public static float mileageOfCar(){
        return mileage;
    }
    public static String colourOfCar(){
        return colour;
    }
    
}
