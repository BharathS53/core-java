public class Hospital2 {
    private String name;
    private String location;
    private int capacity;
    private Doctor doctor;

    public Hospital2(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Hospital2(String name, String location, int capacity) {
        this(name, location);
        this.capacity = capacity;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
