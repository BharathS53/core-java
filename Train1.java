public class Train1 {
    private String name;
    private int maxSpeed;
    private String type;
    private int coaches;
    private String color;

    public Train1(String name) {
        this.name = name;
        System.out.println("Name set");
    }

    public Train1(String name, int maxSpeed) {
        this(name);
        this.maxSpeed = maxSpeed;
        System.out.println("Max speed set");
    }

    public Train1(String name, int maxSpeed, String type) {
        this(name, maxSpeed);
        this.type = type;
        System.out.println("Type set");
    }

    public Train1(String name, int maxSpeed, String type, int coaches) {
        this(name, maxSpeed, type);
        this.coaches = coaches;
        System.out.println("Coaches set");
    }

    public Train1(String name, int maxSpeed, String type, int coaches, String color) {
        this(name, maxSpeed, type, coaches);
        this.color = color;
        System.out.println("Color set");
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public int getCoaches() {
        return coaches;
    }

    public String getColor() {
        return color;
    }
}
