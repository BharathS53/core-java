public class MallRunner {
    public static void main(String[] args) {
        String[] shopNames = {"Zudio", "Puma", "Reliance Trends", "Max"};
        int[] floorCounts = {3, 2, 4, 5};
        boolean[] hasFoodCourt = {true, false, true, true};
        float[] avgRating = {4.2f, 3.9f, 4.5f, 4.0f};
        double[] monthlyRent = {120000.50, 95000.75, 130000.25, 110000.00};
        char[] wings = {'A', 'B', 'C', 'D'};
        long[] shopkeeperIds = {500101L, 500102L, 500103L, 500104L};
        short[] emergencyExits = {2, 3, 1, 4};
        byte[] openHours = {10, 9, 11, 10};

        Mall mall = new Mall(shopNames, floorCounts, hasFoodCourt, avgRating, monthlyRent,
                             wings, shopkeeperIds, emergencyExits, openHours);

        for (String shop : mall.getShopNames()) {
            System.out.println("Shop Name: " + shop);
        }

        for (int floors : mall.getFloorCounts()) {
            System.out.println("Floor Count: " + floors);
        }

        for (boolean foodCourt : mall.getHasFoodCourt()) {
            System.out.println("Has Food Court: " + foodCourt);
        }

        for (float rating : mall.getAvgRating()) {
            System.out.println("Average Rating: " + rating);
        }

        for (double rent : mall.getMonthlyRent()) {
            System.out.println("Monthly Rent: " + rent);
        }

        for (char wing : mall.getWings()) {
            System.out.println("Wing: " + wing);
        }

        for (long id : mall.getShopkeeperIds()) {
            System.out.println("Shopkeeper ID: " + id);
        }

        for (short exit : mall.getEmergencyExits()) {
            System.out.println("Emergency Exits: " + exit);
        }

        for (byte hour : mall.getOpenHours()) {
            System.out.println("Open Hour: " + hour + " AM");
        }
    }
}