public class Truck1Runner {
    public static void main(String[] args) {
        Truck1 truck1 = new Truck1("Tata Motors", 12000, "Diesel", "White", 400);
        System.out.println(truck1.getBrand());
        System.out.println(truck1.getLoadCapacity());
        System.out.println(truck1.getFuelType());
        System.out.println(truck1.getColor());
        System.out.println(truck1.getHorsepower());

        Truck1 truck2 = new Truck1("Ashok Leyland", 10000, "Diesel", "Blue", 380);
        System.out.println(truck2.getBrand());
        System.out.println(truck2.getLoadCapacity());
        System.out.println(truck2.getFuelType());
        System.out.println(truck2.getColor());
        System.out.println(truck2.getHorsepower());

        Truck1 truck3 = new Truck1("BharatBenz", 14000, "Diesel", "Grey", 420);
        System.out.println(truck3.getBrand());
        System.out.println(truck3.getLoadCapacity());
        System.out.println(truck3.getFuelType());
        System.out.println(truck3.getColor());
        System.out.println(truck3.getHorsepower());

        Truck1 truck4 = new Truck1("Eicher", 9000, "CNG", "Red", 360);
        System.out.println(truck4.getBrand());
        System.out.println(truck4.getLoadCapacity());
        System.out.println(truck4.getFuelType());
        System.out.println(truck4.getColor());
        System.out.println(truck4.getHorsepower());

        Truck1 truck5 = new Truck1("Volvo", 16000, "Diesel", "Black", 450);
        System.out.println(truck5.getBrand());
        System.out.println(truck5.getLoadCapacity());
        System.out.println(truck5.getFuelType());
        System.out.println(truck5.getColor());
        System.out.println(truck5.getHorsepower());
    }
}
