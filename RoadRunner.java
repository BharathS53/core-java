public class RoadRunner {
    public static void main(String[] args) {
        // 5 objects using no-arg constructor + set methods
        Road r1 = new Road();
        r1.setName("MG Road");
        r1.setSize(50);
        r1.setLocation("Bangalore");

        Road r2 = new Road();
        r2.setName("Ring Road");
        r2.setSize(100);
        r2.setLocation("Mysore");

        Road r3 = new Road();
        r3.setName("Highway NH 4");
        r3.setSize(150);
        r3.setLocation("Davanagere");

        Road r4 = new Road();
        r4.setName("Beach Road");
        r4.setSize(80);
        r4.setLocation("Mangalore");

        Road r5 = new Road();
        r5.setName("Expressway");
        r5.setSize(200);
        r5.setLocation("udupi");

        System.out.println("=== No-arg Constructor Initialized ===");
        r1.printDetails();
        r2.printDetails();
        r3.printDetails();
        r4.printDetails();
        r5.printDetails();

        // 5 objects using parameterized constructor
        Road p1 = new Road("Hill Road", 60, "Shimla");
        Road p2 = new Road("Bridge Road", 70, "Kolkata");
        Road p3 = new Road("Airport Road", 90, "Pune");
        Road p4 = new Road("Market Road", 55, "Ahmedabad");
        Road p5 = new Road("Canal Road", 85, "Surat");

        // Re-initialize using set methods
        p1.setName("Mountain View Road");
        p1.setSize(65);
        p1.setLocation("bidar");

        p2.setName("River Side");
        p2.setSize(75);
        p2.setLocation("kolar");

        p3.setName("Outer Ring Road");
        p3.setSize(95);
        p3.setLocation("mandya");

        p4.setName("Central Street");
        p4.setSize(60);
        p4.setLocation("hubli");

        p5.setName("West End Road");
        p5.setSize(88);
        p5.setLocation("dharwad");

        System.out.println("=== Parameterized Constructor Re-initialized ===");
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
        p5.printDetails();
    }
}