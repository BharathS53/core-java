public class Bus1Runner {
    public static void main(String[] args) {
        Bus1 bus1 = new Bus1("Volvo", 50, "White", "Diesel", 320);
        System.out.println(bus1.getBrand());
        System.out.println(bus1.getSeatingCapacity());
        System.out.println(bus1.getColor());
        System.out.println(bus1.getFuelType());
        System.out.println(bus1.getEnginePower());

        Bus1 bus2 = new Bus1("Mercedes-Benz", 45, "Silver", "Diesel", 340);
        System.out.println(bus2.getBrand());
        System.out.println(bus2.getSeatingCapacity());
        System.out.println(bus2.getColor());
        System.out.println(bus2.getFuelType());
        System.out.println(bus2.getEnginePower());

        Bus1 bus3 = new Bus1("Ashok Leyland", 55, "Blue", "CNG", 300);
        System.out.println(bus3.getBrand());
        System.out.println(bus3.getSeatingCapacity());
        System.out.println(bus3.getColor());
        System.out.println(bus3.getFuelType());
        System.out.println(bus3.getEnginePower());

        Bus1 bus4 = new Bus1("Tata Motors", 60, "Red", "Diesel", 310);
        System.out.println(bus4.getBrand());
        System.out.println(bus4.getSeatingCapacity());
        System.out.println(bus4.getColor());
        System.out.println(bus4.getFuelType());
        System.out.println(bus4.getEnginePower());

        Bus1 bus5 = new Bus1("Scania", 48, "Yellow", "Electric", 400);
        System.out.println(bus5.getBrand());
        System.out.println(bus5.getSeatingCapacity());
        System.out.println(bus5.getColor());
        System.out.println(bus5.getFuelType());
        System.out.println(bus5.getEnginePower());
    }
}