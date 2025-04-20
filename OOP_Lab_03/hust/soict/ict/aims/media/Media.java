package OOP_Lab_03.hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Media implements Comparable<Media> {

    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new ComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new ComparatorByCostTitle();

    public Media() {
        // Constructor from Superclass
    }

    public Media(String category, float cost, int id, String title) {
        this.category = category;
        this.cost = cost;
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media)) return false; // Not a Media obj
        Media other = (Media) o; // Cast to Media
        return this.title != null && this.title.equals(other.title); // Compare titles
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }

    @Override
    public int compareTo(Media o) {
        if (o instanceof Media) {
            return this.getTitle().compareTo(o.getTitle());
        }
        return 0;
    }

    // Comparator for sorting by title, then cost
    static class ComparatorByTitleCost implements Comparator<Media> {
        @Override
        public int compare(Media m1, Media m2) {
            int titleCompare = m1.getTitle().compareTo(m2.getTitle());
            if (titleCompare != 0) return titleCompare;
            return Float.compare(m1.getCost(), m2.getCost());
        }
    }

    // Comparator for sorting by cost, then title
    static class ComparatorByCostTitle implements Comparator<Media> {
        @Override
        public int compare(Media m1, Media m2) {
            int costCompare = Float.compare(m1.getCost(), m2.getCost());
            if (costCompare != 0) return costCompare;
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }

    public static void main(String[] args) {
        ArrayList<Media> collection = new ArrayList<>();
        collection.add(new Book("Fiction", 10.0f, 1, "Book A", "Tuan"));
        collection.add(new DigitalVideoDisc("Action", 15.0f, 2, "Action", 44, "Director A"));
        collection.add(new Disc("Drama", 10.5f, 3, "Disc B", 90, "Director B")); // Fixed

        // Sort by title and cost
        System.out.println("Sorting by title and cost:");
        java.util.Collections.sort(collection, Media.COMPARE_BY_TITLE_COST);
        for (Media media : collection) {
            System.out.println(media);
        }
        System.out.println();

        // Sort by cost and title
        System.out.println("Sorting by cost and title:");
        java.util.Collections.sort(collection, Media.COMPARE_BY_COST_TITLE);
        for (Media media : collection) {
            System.out.println(media);
        }
        System.out.println();

        // Sort using Comparable (by title)
        System.out.println("Sorting by title (using Comparable):");
        java.util.Collections.sort(collection); // Uses compareTo
        for (Media media : collection) {
            System.out.println(media);
        }
    }
}