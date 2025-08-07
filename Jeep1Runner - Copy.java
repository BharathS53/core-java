public class Jeep1Runner {
    public static void main(String[] args) {
        Jeep1 jeep1 = new Jeep1("Jeep Compass", 180, "White", "4WD", 350);
        System.out.println(jeep1.getBrand());
        System.out.println(jeep1.getTopSpeed());
        System.out.println(jeep1.getColor());
        System.out.println(jeep1.getDriveType());
        System.out.println(jeep1.getTorque());

        Jeep1 jeep2 = new Jeep1("Mahindra Thar", 160, "Black", "4x4", 320);
        System.out.println(jeep2.getBrand());
        System.out.println(jeep2.getTopSpeed());
        System.out.println(jeep2.getColor());
        System.out.println(jeep2.getDriveType());
        System.out.println(jeep2.getTorque());

        Jeep1 jeep3 = new Jeep1("Toyota Fortuner", 200, "Silver", "AWD", 400);
        System.out.println(jeep3.getBrand());
        System.out.println(jeep3.getTopSpeed());
        System.out.println(jeep3.getColor());
        System.out.println(jeep3.getDriveType());
        System.out.println(jeep3.getTorque());

        Jeep1 jeep4 = new Jeep1("Ford Bronco", 190, "Blue", "4WD", 370);
        System.out.println(jeep4.getBrand());
        System.out.println(jeep4.getTopSpeed());
        System.out.println(jeep4.getColor());
        System.out.println(jeep4.getDriveType());
        System.out.println(jeep4.getTorque());

        Jeep1 jeep5 = new Jeep1("Land Rover Defender", 210, "Green", "AWD", 450);
        System.out.println(jeep5.getBrand());
        System.out.println(jeep5.getTopSpeed());
        System.out.println(jeep5.getColor());
        System.out.println(jeep5.getDriveType());
        System.out.println(jeep5.getTorque());
    }
}