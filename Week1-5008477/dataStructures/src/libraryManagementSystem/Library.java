package libraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;

    // Constructor
    public Library(Book[] books) {
        this.books = books;
    }

    // Method to perform linear search
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to perform binary search
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER)); // Ensure the array is sorted by title

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // Create an array of books
        Book[] books = {
            new Book("1", "To Kill a Mockingbird", "Harper Lee"),
            new Book("2", "1984", "George Orwell"),
            new Book("3", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("4", "The Catcher in the Rye", "J.D. Salinger"),
            new Book("5", "The Hobbit", "J.R.R. Tolkien")
        };

        // Create a library instance with the books
        Library library = new Library(books);

        // Perform linear search
        String searchTitleLinear = "1984";
        Book foundBookLinear = library.linearSearchByTitle(searchTitleLinear);
        if (foundBookLinear != null) {
            System.out.println("Linear Search: Found book - " + foundBookLinear);
        } else {
            System.out.println("Linear Search: Book not found");
        }

        // Perform binary search
        String searchTitleBinary = "The Hobbit";
        Book foundBookBinary = library.binarySearchByTitle(searchTitleBinary);
        if (foundBookBinary != null) {
            System.out.println("Binary Search: Found book - " + foundBookBinary);
        } else {
            System.out.println("Binary Search: Book not found");
        }
    }
}
