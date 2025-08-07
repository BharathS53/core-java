public class HospitalDoctorRunner {
    public static void main(String args[]) {
        Hospital2 hospital2 = new Hospital2("nandan care", "MG Road", 500);
        System.out.println(hospital2.getName());
        System.out.println(hospital2.getLocation());
        System.out.println(hospital2.getCapacity());

        Doctor doctor = new Doctor("Dr.nandan", "Cardiology", 15);
        System.out.println(doctor.getName());
        System.out.println(doctor.getSpecialization());
        System.out.println(doctor.getExperience());
    }
}
