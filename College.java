public class College {
    String[] departments;
    int[] studentStrength;
    boolean[] hasPlacementCell;
    float[] avgCgpa;
    double[] courseFees;
    char[] blocks;
    long[] facultyIds;
    short[] classroomNumbers;
    byte[] yearBatches;

    public College(String[] departments, int[] studentStrength, boolean[] hasPlacementCell,
                   float[] avgCgpa, double[] courseFees, char[] blocks, long[] facultyIds,
                   short[] classroomNumbers, byte[] yearBatches) {
        this.departments = departments;
        this.studentStrength = studentStrength;
        this.hasPlacementCell = hasPlacementCell;
        this.avgCgpa = avgCgpa;
        this.courseFees = courseFees;
        this.blocks = blocks;
        this.facultyIds = facultyIds;
        this.classroomNumbers = classroomNumbers;
        this.yearBatches = yearBatches;
    }

    public String[] getDepartments() {
        return departments;
    }

    public int[] getStudentStrength() {
        return studentStrength;
    }

    public boolean[] getHasPlacementCell() {
        return hasPlacementCell;
    }

    public float[] getAvgCgpa() {
        return avgCgpa;
    }

    public double[] getCourseFees() {
        return courseFees;
    }

    public char[] getBlocks() {
        return blocks;
    }

    public long[] getFacultyIds() {
        return facultyIds;
    }

    public short[] getClassroomNumbers() {
        return classroomNumbers;
    }

    public byte[] getYearBatches() {
        return yearBatches;
    }
}
