public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 3);
        course.setName("Advanced Java");
        course.setDuration(4);
        course.printDetails();
    }
}