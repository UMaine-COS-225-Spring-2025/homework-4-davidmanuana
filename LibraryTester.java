public class LibraryTester {
    public static void main(String[] args) {
       
        BookShelf first_bookShelf = new BookShelf('O');
        BookShelf second_bookShelf = new BookShelf('T');

       
        System.out.println(first_bookShelf.toString());
        System.out.println(second_bookShelf.toString());

        
        Book first_book = new Book("The Heart of the Betrayed", "Crime");
        Book second_book = new Book("Our Hill of Stars", "Fantasy");
        Book third_book = new Book("One of a Kind", "Science Fiction");
        Book fourth_book = new Book("The Vision of Roses", "Romance");

       
        System.out.println(first_book.toString());
        System.out.println(second_book.toString());
        System.out.println(third_book.toString());
        System.out.println(fourth_book.toString());

      
        first_bookShelf.add_book(second_book); // 'O' shelf
        first_bookShelf.add_book(third_book); // 'O' shelf

        second_bookShelf.add_book(first_book); // 'T' shelf
        second_bookShelf.add_book(fourth_book); // 'T' shelf

        
        System.out.println(first_bookShelf.toString());
        System.out.println(second_bookShelf.toString());
    }
}
