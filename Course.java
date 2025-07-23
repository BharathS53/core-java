class Course {
    private String name;
    private int duration; 
    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
        System.out.println("Course - Name: " + name + ", Duration: " + duration + " months");
    }

    public void setName(String name) { this.name = name; }
    public void setDuration(int duration) { this.duration = duration; }

    public void printDetails() {
        System.out.println("Updated Course - Name: " + name + ", Duration: " + duration + " months");
    }
}