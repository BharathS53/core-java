public class Zoo1Runner {
    public static void main(String args[]) {
        Zoo1[] zoos = new Zoo1[5];

        Zoo1 z1 = new Zoo1();
        z1.setName("Bannerghatta Zoo");
        z1.setAnimalType("Wildlife");

        Zoo1 z2 = new Zoo1();
        z2.setName("Mysore Zoo");
        z2.setAnimalType("Mixed");

        for (int i = 0; i < zoos.length; i++) {
            if (i == 0) zoos[0] = z1;
            else if (i == 1) zoos[1] = z2;
        }

        for (int i = 0; i < zoos.length; i++) {
            Zoo1 z = zoos[i];
            if (z != null) {
                System.out.println(z.getName());
                System.out.println(z.getAnimalType());
            }
        }
    }
}