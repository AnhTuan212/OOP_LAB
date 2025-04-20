package OOP_Lab_03.hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        // CompactDisc
        List<Track> tracks =new ArrayList<>() ;
        tracks.add(new Track("Track 1", 120));
        tracks.add(new Track("Track 2", 150));

        CompactDisc cd = new CompactDisc("Pop Album", 29.99f, 1, "Pop",2, "Director A", "Artist A",tracks);

        // DigitalVideoDisc
        DigitalVideoDisc dvd = new DigitalVideoDisc("Action Movie", "Action", "Director B", 120, 19.99f);

        // Book
        List<String> authors = Arrays.asList("Author 1", "Author 2");
        Book book = new Book("Fiction", 15.99f, 3, "Novel Title", authors);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
