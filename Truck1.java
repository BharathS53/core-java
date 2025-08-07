public class Truck1 {
    private String brand;
    private int loadCapacity;
    private String fuelType;
    private String color;
    private int horsepower;

    public Truck1(String brand) {
        this.brand = brand;
        System.out.println("initializing brand");
    }

    public Truck1(String brand, int loadCapacity) {
        this(brand);
        System.out.println("initializing loadCapacity");
        this.loadCapacity = loadCapacity;
    }

    public Truck1(String brand, int loadCapacity, String fuelType) {
        this(brand, loadCapacity);
        System.out.println("initializing fuelType");
        this.fuelType = fuelType;
    }

    public Truck1(String brand, int loadCapacity, String fuelType, String color) {
        this(brand, loadCapacity, fuelType);
        System.out.println("initializing color");
        this.color = color;
    }

    public Truck1(String brand, int loadCapacity, String fuelType, String color, int horsepower) {
        this(brand, loadCapacity, fuelType, color);
        System.out.println("initializing horsepower");
        this.horsepower = horsepower;
    }

    public String getBrand() { return brand; }
    public int getLoadCapacity() { return loadCapacity; }
    public String getFuelType() { return fuelType; }
    public String getColor() { return color; }
    public int getHorsepower() { return horsepower; }
}
