package OOP_Lab_03.hust.soict.ict.aims.media;
import java.util.Comparator;

public class ComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        if (m1 == null || m2 == null) return (m1 == null) ? -1 : 1; // Null handling

        // Compare by title (ascending)
        if (m1.getTitle() == null || m2.getTitle() == null) {
            return (m1.getTitle() == null) ? -1 : 1; // Null titles last
        }
        int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }

        // If titles are equal, compare by cost (descending)
        return Float.compare(m2.getCost(), m1.getCost());
    }
}
