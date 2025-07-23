public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care", 150);
        hospital.setName("Green Valley");
        hospital.setBeds(200);
        hospital.printDetails();
    }
}