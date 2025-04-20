package OOP_Lab_03.hust.soict.ict.aims.media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book() {
        // Calls the superclass
    }

    public Book(String category, float cost, int id, String title, List<String> authors) {
        super(category, cost, id, title);
        this.authors = authors;
    }
    public Book(String category, float cost, int id, String title, String authors) {
        super(category, cost, id, title);
        this.authors = Collections.singletonList(authors);
    }

    @Override
    public String toString() {
        return "Book: " +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cost=" + getCost() +
                ", authors=" + authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
        else {
            System.out.println("The author is already in the list");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
        else {
            System.out.println("The author has been remove from the list");
        }
    }
}

