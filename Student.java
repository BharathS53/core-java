public class Student {
    private String name;
    private String department;
    private int semester;

    public static int collegeCode;
    static {
        System.out.println("static block in Student");
        collegeCode = 1001;
    }
    {
        System.out.println("non static block in student");
        collegeCode = 2002;
    }

    public void setname(String studentName) {
        name = studentName;
    }

    public void setdepartment(String studentDepartment) {
        department = studentDepartment;
    }

    public void setsemester(int studentSemester) {
        semester = studentSemester;
    }

    public String getname() {
        return name;
    }

    public String getdepartment() {
        return department;
    }

    public int getsemester() {
        return semester;
    }
}
