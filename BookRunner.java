public class BookRunner
{
    public static void main(String[] args)
    {
        // Set static fields once globally
        Book.setPublisher("HarperCollins");
        Book.setDiscount(50.0f);

        Book book = new Book();
        book.setTitle("The Alchemist");
        book.setPrice(299.0f);
        book.setIsbn(1001);
        book.setAuthor("Paulo Coelho");
        book.setRating(4.5f);

        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setPrice(350.0f);
        book1.setIsbn(1002);
        book1.setAuthor("George Orwell");
        book1.setRating(4.7f);

        Book book2 = new Book();
        book2.setTitle("To Kill a Mockingbird");
        book2.setPrice(320.0f);
        book2.setIsbn(1003);
        book2.setAuthor("Harper Lee");
        book2.setRating(4.8f);

        Book book3 = new Book();
        book3.setTitle("The Great Gatsby");
        book3.setPrice(280.0f);
        book3.setIsbn(1004);
        book3.setAuthor("F. Scott Fitzgerald");
        book3.setRating(4.6f);

        Book book4 = new Book();
        book4.setTitle("Pride and Prejudice");
        book4.setPrice(300.0f);
        book4.setIsbn(1005);
        book4.setAuthor("Jane Austen");
        book4.setRating(4.9f);

        Book book5 = new Book();
        book5.setTitle("Moby Dick");
        book5.setPrice(270.0f);
        book5.setIsbn(1006);
        book5.setAuthor("Herman Melville");
        book5.setRating(4.3f);

        Book book6 = new Book();
        book6.setTitle("The Hobbit");
        book6.setPrice(360.0f);
        book6.setIsbn(1007);
        book6.setAuthor("J.R.R. Tolkien");
        book6.setRating(4.8f);

        Book book7 = new Book();
        book7.setTitle("The Catcher in the Rye");
        book7.setPrice(310.0f);
        book7.setIsbn(1008);
        book7.setAuthor("J.D. Salinger");
        book7.setRating(4.2f);

        Book book8 = new Book();
        book8.setTitle("The Lord of the Rings");
        book8.setPrice(450.0f);
        book8.setIsbn(1009);
        book8.setAuthor("J.R.R. Tolkien");
        book8.setRating(5.0f);

        Book book9 = new Book();
        book9.setTitle("Brave New World");
        book9.setPrice(330.0f);
        book9.setIsbn(1010);
        book9.setAuthor("Aldous Huxley");
        book9.setRating(4.4f);

        // Optional: print a sample to verify output
        System.out.println("Sample Book: " + book.getTitle() + " | Author: " + book.getAuthor() + " | Publisher: " + Book.getPublisher());
    }
}