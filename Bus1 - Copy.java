public class Bus1 {
    private String brand;
    private int seatingCapacity;
    private String color;
    private String fuelType;
    private int enginePower;

    public Bus1(String brand) {
        this.brand = brand;
        System.out.println("Initializing brand");
    }

    public Bus1(String brand, int seatingCapacity) {
        this(brand);
        this.seatingCapacity = seatingCapacity;
        System.out.println("Initializing seating capacity");
    }

    public Bus1(String brand, int seatingCapacity, String color) {
        this(brand, seatingCapacity);
        this.color = color;
        System.out.println("Initializing color");
    }

    public Bus1(String brand, int seatingCapacity, String color, String fuelType) {
        this(brand, seatingCapacity, color);
        this.fuelType = fuelType;
        System.out.println("Initializing fuel type");
    }

    public Bus1(String brand, int seatingCapacity, String color, String fuelType, int enginePower) {
        this(brand, seatingCapacity, color, fuelType);
        this.enginePower = enginePower;
        System.out.println("Initializing engine power");
    }

    public String getBrand() {
        return brand;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
