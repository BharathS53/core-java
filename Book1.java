public class Book1 {
    private String title;
    private String author;
    private int pages;

    public static int edition;
    static {
        System.out.println("static block in Book1");
        edition = 1;
    }
    {
        System.out.println("non static block in book1");
        edition = 2;
    }

    public void settitle(String bookTitle) {
        title = bookTitle;
    }

    public void setauthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setpages(int bookPages) {
        pages = bookPages;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public int getpages() {
        return pages;
    }
}
