import java.util.ArrayList;

public class BookShelf {
    char first_letter; 
    ArrayList<Book> bookShelf = new ArrayList<Book>();

    
    public BookShelf(char first_letter) {
        this.first_letter = first_letter;
    }

 
    public char getFirstLetter() {
        return first_letter;
    }

    public void setFirstLetter(char new_letter) {
        this.first_letter = new_letter;
    }

    
    public void add_book(Book book) {
        if (book.getTitle().charAt(0) == first_letter && bookShelf.size() < 8) {
            bookShelf.add(book);
        }
    }

   
    public void removeBook(Book book) {
        bookShelf.remove(book);
    }

    public String toString() {
        if (bookShelf.isEmpty()) {
            return "Empty";
        }

        String final_string = "";
        for (int i = 0; i < bookShelf.size(); i++) {
            final_string += bookShelf.get(i).getTitle() + "   "; 
        }
        return final_string.trim();
    }
}
