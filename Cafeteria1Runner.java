public class Cafeteria1Runner {
    public static void main(String args[]) {
        Cafeteria1[] cafes = new Cafeteria1[5];

        Cafeteria1 c1 = new Cafeteria1();
        c1.setName("Amul Cafe");
        c1.setAddress("MG Road");

        Cafeteria1 c2 = new Cafeteria1();
        c2.setName("CCD");
        c2.setAddress("Indiranagar");

        for (int i = 0; i < cafes.length; i++) {
            if (i == 0) cafes[0] = c1;
            else if (i == 1) cafes[1] = c2;
        }

        for (int i = 0; i < cafes.length; i++) {
            Cafeteria1 c = cafes[i];
            if (c != null) {
                System.out.println(c.getName());
                System.out.println(c.getAddress());
            }
        }
    }
}