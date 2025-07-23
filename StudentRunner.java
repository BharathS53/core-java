public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname("Aarav");
        s1.setdepartment("Computer Science");
        s1.setsemester(5);
        System.out.println(s1.getname());
        System.out.println(s1.getdepartment());
        System.out.println(s1.getsemester());
        System.out.println(Student.collegeCode);

        Student s2 = new Student(); s2.setname("Riya"); s2.setdepartment("Electronics"); s2.setsemester(3);
        Student s3 = new Student(); s3.setname("Manoj"); s3.setdepartment("Mechanical"); s3.setsemester(7);
        Student s4 = new Student(); s4.setname("Sara"); s4.setdepartment("Civil"); s4.setsemester(4);
        Student s5 = new Student(); s5.setname("Vikram"); s5.setdepartment("IT"); s5.setsemester(6);
        Student s6 = new Student(); s6.setname("Sneha"); s6.setdepartment("Computer Science"); s6.setsemester(2);
        Student s7 = new Student(); s7.setname("Rahul"); s7.setdepartment("ECE"); s7.setsemester(8);
        Student s8 = new Student(); s8.setname("Kriti"); s8.setdepartment("Electrical"); s8.setsemester(1);
        Student s9 = new Student(); s9.setname("Yash"); s9.setdepartment("BioTech"); s9.setsemester(3);
        Student s10 = new Student(); s10.setname("Divya"); s10.setdepartment("Chemical"); s10.setsemester(6);

        Student[] students = {s2, s3, s4, s5, s6, s7, s8, s9, s10};
        for (Student s : students) {
            System.out.println(s.getname());
            System.out.println(s.getdepartment());
            System.out.println(s.getsemester());
            System.out.println(Student.collegeCode);
        }
    }
}
