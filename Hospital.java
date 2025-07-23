class Hospital {
    private String name;
    private int beds;

    public Hospital(String name, int beds) {
        this.name = name;
        this.beds = beds;
        System.out.println("Hospital - Name: " + name + ", Beds: " + beds);
    }

    public void setName(String name) { this.name = name; }
    public void setBeds(int beds) { this.beds = beds; }

    public void printDetails() {
        System.out.println("Updated Hospital - Name: " + name + ", Beds: " + beds);
    }
}