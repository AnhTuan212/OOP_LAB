package OOP_Lab_03.hust.soict.ict.aims.Cart;

import OOP_Lab_03.hust.soict.ict.aims.media.Media;
import java.util.ArrayList;
import java.util.Comparator;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Add media to the cart
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media has been added: " + media.getTitle());
    }

    // Remove media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed: " + media.getTitle());
        } else {
            System.out.println("The media '" + media.getTitle() + "' was not found in the cart.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Print cart contents
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    // Filter media by ID
    public void filterByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with ID: " + id);
        }
    }

    // Filter media by title
    public void filterByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: " + title);
        }
    }

    // Sort media by title
    public void sortByTitle() {
        itemsOrdered.sort(null); // Uses natural ordering from Media's compareTo
        System.out.println("Cart sorted by title.");
    }

    // Sort media by cost
    public void sortByCost() {
        itemsOrdered.sort(Comparator.comparing(Media::getCost));
        System.out.println("Cart sorted by cost.");
    }

    // Empty the cart
    public void emptyCart() {
        itemsOrdered.clear();
        System.out.println("Cart has been emptied.");
    }

    // Get the list of ordered items
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public Media searchMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("Media not found: " + title);
        return null;
    }
}