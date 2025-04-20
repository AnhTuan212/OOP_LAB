package OOP_Lab_03.hust.soict.ict.aims.media;

import java.util.Comparator;

public class ComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        if (m1 == null || m2 == null) return (m1 == null) ? -1 : 1; // Null handling

        // Compare by cost (descending)
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        if (costComparison != 0) {
            return costComparison;
        }

        // If costs are equal, compare by title (ascending)
        if (m1.getTitle() == null || m2.getTitle() == null) {
            return (m1.getTitle() == null) ? -1 : 1; // Null titles last
        }
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
