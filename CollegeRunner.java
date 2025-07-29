public class CollegeRunner {
    public static void main(String[] args) {
        String[] departments = {"CSE", "ECE", "Mechanical", "Civil"};
        int[] studentStrength = {120, 100, 80, 60};
        boolean[] hasPlacementCell = {true, true, false, true};
        float[] avgCgpa = {8.2f, 7.8f, 6.9f, 7.5f};
        double[] courseFees = {85000.50, 80000.75, 75000.25, 72000.00};
        char[] blocks = {'A', 'B', 'C', 'D'};
        long[] facultyIds = {200101L, 200102L, 200103L, 200104L};
        short[] classroomNumbers = {301, 302, 303, 304};
        byte[] yearBatches = {1, 2, 3, 4};

        College college = new College(departments, studentStrength, hasPlacementCell,
                                      avgCgpa, courseFees, blocks, facultyIds,
                                      classroomNumbers, yearBatches);

        for (String dept : college.getDepartments()) {
            System.out.println("Department: " + dept);
        }

        for (int strength : college.getStudentStrength()) {
            System.out.println("Student Strength: " + strength);
        }

        for (boolean placement : college.getHasPlacementCell()) {
            System.out.println("Has Placement Cell: " + placement);
        }

        for (float cgpa : college.getAvgCgpa()) {
            System.out.println("Average CGPA: " + cgpa);
        }

        for (double fee : college.getCourseFees()) {
            System.out.println("Course Fee: " + fee);
        }

        for (char block : college.getBlocks()) {
            System.out.println("Block: " + block);
        }

        for (long fid : college.getFacultyIds()) {
            System.out.println("Faculty ID: " + fid);
        }

        for (short room : college.getClassroomNumbers()) {
            System.out.println("Classroom Number: " + room);
        }

        for (byte batch : college.getYearBatches()) {
            System.out.println("Year Batch: " + batch);
        }
    }
}
