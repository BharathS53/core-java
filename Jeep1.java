public class Jeep1 {
    private String brand;
    private int topSpeed;
    private String color;
    private String driveType;
    private int torque;

    public Jeep1(String brand) {
        this.brand = brand;
        System.out.println("initializing brand");
    }

    public Jeep1(String brand, int topSpeed) {
        this(brand);
        System.out.println("initializing topSpeed");
        this.topSpeed = topSpeed;
    }

    public Jeep1(String brand, int topSpeed, String color) {
        this(brand, topSpeed);
        System.out.println("initializing color");
        this.color = color;
    }

    public Jeep1(String brand, int topSpeed, String color, String driveType) {
        this(brand, topSpeed, color);
        System.out.println("initializing driveType");
        this.driveType = driveType;
    }

    public Jeep1(String brand, int topSpeed, String color, String driveType, int torque) {
        this(brand, topSpeed, color, driveType);
        System.out.println("initializing torque");
        this.torque = torque;
    }

    public String getBrand() {
        return brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getDriveType() {
        return driveType;
    }

    public int getTorque() {
        return torque;
    }
}