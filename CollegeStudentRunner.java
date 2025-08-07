public class CollegeStudentRunner {
    public static void main(String args[]){
        College2 college2=new College2("global","rr nagar",2000);
        System.out.println(college2.getName());
        System.out.println(college2.getLocation());
        System.out.println(college2.getStrength());

        Student2 student2=new Student2("bharath","mca",23);
        System.out.println(student2.getName());
        System.out.println(student2.getCourse());
        System.out.println(student2.getAge());

    }
}
