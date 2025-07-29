public class LibraryRunner {
    public static void main(String[] args) {

        String[] titles = LibraryA.getBookTitles();
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Book Title: " + titles[i]);
        }

        int[] counts = LibraryA.getBookCounts();
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Book Count: " + counts[i]);
        }

        boolean[] availability = LibraryA.getIsAvailable();
        for (int i = 0; i < availability.length; i++) {
            System.out.println("Is Available: " + availability[i]);
        }

        float[] ratings = LibraryA.getRatings();
        for (int i = 0; i < ratings.length; i++) {
            System.out.println("Rating: " + ratings[i]);
        }

        double[] prices = LibraryA.getBookPrices();
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Book Price: " + prices[i]);
        }

        char[] sections = LibraryA.getShelfSections();
        for (int i = 0; i < sections.length; i++) {
            System.out.println("Shelf Section: " + sections[i]);
        }

        long[] isbn = LibraryA.getIsbnNumbers();
        for (int i = 0; i < isbn.length; i++) {
            System.out.println("ISBN Number: " + isbn[i]);
        }

        short[] racks = LibraryA.getRackNumbers();
        for (int i = 0; i < racks.length; i++) {
            System.out.println("Rack Number: " + racks[i]);
        }

        byte[] floors = LibraryA.getFloorNumbers();
        for (int i = 0; i < floors.length; i++) {
            System.out.println("Floor Number: " + floors[i]);
        }
    }
}