public class Restaurant1Runner {
    public static void main(String args[]) {
        Restaurant1[] restaurants = new Restaurant1[5];

        Restaurant1 r1 = new Restaurant1();
        r1.setName("Empire");
        r1.setCuisine("Indian");

        Restaurant1 r2 = new Restaurant1();
        r2.setName("Chin Chin");
        r2.setCuisine("Chinese");

        for (int i = 0; i < restaurants.length; i++) {
            if (i == 0) restaurants[0] = r1;
            else if (i == 1) restaurants[1] = r2;
        }

        for (int i = 0; i < restaurants.length; i++) {
            Restaurant1 r = restaurants[i];
            if (r != null) {
                System.out.println(r.getName());
                System.out.println(r.getCuisine());
            }
        }
    }
}