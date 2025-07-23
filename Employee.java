class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee - Name: " + name + ", ID: " + id);
    }

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }

    public void printDetails() {
        System.out.println("Updated Employee - Name: " + name + ", ID: " + id);
    }
}