public class LibraryA {
    static String[] bookTitles = {"The Alchemist", "1984", "Moby Dick", "Pride and Prejudice"};
    static int[] bookCounts = {4, 6, 3, 5};
    static boolean[] isAvailable = {true, true, false, true};
    static float[] ratings = {4.5f, 4.8f, 3.9f, 4.2f};
    static double[] bookPrices = {299.99, 199.50, 150.75, 175.25};
    static char[] shelfSections = {'A', 'B', 'C', 'D'};
    static long[] isbnNumbers = {9780134685991L, 9780451524935L, 9781503280786L, 9781503290563L};
    static short[] rackNumbers = {101, 102, 103, 104};
    static byte[] floorNumbers = {1, 2, 1, 2};

    public static String[] getBookTitles() {
        return bookTitles;
    }

    public static int[] getBookCounts() {
        return bookCounts;
    }

    public static boolean[] getIsAvailable() {
        return isAvailable;
    }

    public static float[] getRatings() {
        return ratings;
    }

    public static double[] getBookPrices() {
        return bookPrices;
    }

    public static char[] getShelfSections() {
        return shelfSections;
    }

    public static long[] getIsbnNumbers() {
        return isbnNumbers;
    }

    public static short[] getRackNumbers() {
        return rackNumbers;
    }

    public static byte[] getFloorNumbers() {
        return floorNumbers;
    }
}