class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        System.out.println("Teacher - Name: " + name + ", Subject: " + subject);
    }

    public void setName(String name) {
        this.name = name;
     }
     
    public void setSubject(String subject) { this.subject = subject; }

    public void printDetails() {
        System.out.println("Updated Teacher - Name: " + name + ", Subject: " + subject);
    }
}