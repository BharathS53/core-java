class Book
{
    private String title;
    private float price;
    private int isbn;
    private String author;
    private float rating;
    static String publisher;
    static float discount;

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setPrice(float bookPrice) {
        price = bookPrice;
    }

    public void setIsbn(int bookIsbn) {
        isbn = bookIsbn;
    }

    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setRating(float bookRating) {
        rating = bookRating;
    }

    public static void setPublisher(String bookPublisher) {
        publisher = bookPublisher;
    }

    public static void setDiscount(float bookDiscount) {
        discount = bookDiscount;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public float getRating() {
        return rating;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static float getDiscount() {
        return discount;
    }
}