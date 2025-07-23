public class Road {
    private String name;
    private int size;
    private String location;

    // Parameterized Constructor
    public Road(String name, int size, String location) {
        this.name = name;
        this.size = size;
        this.location = location;
    }

    // No-argument Constructor
    public Road() {
        // Default constructor
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Road Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Location: " + location);
        System.out.println("------------------------");
    }
}