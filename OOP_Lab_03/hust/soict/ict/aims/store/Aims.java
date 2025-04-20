package OOP_Lab_03.hust.soict.ict.aims.store;

import OOP_Lab_03.hust.soict.ict.aims.Cart.Cart;
import OOP_Lab_03.hust.soict.ict.aims.media.Book;
import OOP_Lab_03.hust.soict.ict.aims.media.CompactDisc;
import OOP_Lab_03.hust.soict.ict.aims.media.DigitalVideoDisc;
import OOP_Lab_03.hust.soict.ict.aims.media.Media;
import OOP_Lab_03.hust.soict.ict.aims.media.Track;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();
        // Create a cart
        Cart cart = new Cart();

        // Create some media with corrected constructors
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Little Mermaid", "Animation", "John Musker", 83, 19.99f);
        Track track1 = new Track("Track 1", 3);
        Track track2 = new Track("Track 2", 4);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        CompactDisc cd1 = new CompactDisc("Music", 29.99f, 5, "CD 1", 0, null, "Artist 1", tracks);
        // Create Book objects
        Book book1 = new Book("Fiction", 12.99f, 6, "The Great Gatsby", Collections.singletonList("F. Scott Fitzgerald"));
        Book book2 = new Book("Non-Fiction", 15.50f, 7, "Sapiens", Collections.singletonList("Yuval Noah Harari"));

        // Add media to store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(cd1);
        store.addMedia(book1); // Add Book 1 to store
        store.addMedia(book2); // Add Book 2 to store

        // Add some media to cart initially
        cart.addMedia(dvd1);
        cart.addMedia(cd1);
        cart.addMedia(book1); // Add Book 1 to cart

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 0:
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    case 1:
                        // View store
                        storeMenu();
                        int storeChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        switch (storeChoice) {
                            case 0:
                                System.out.println("Back to main menu");
                                break;
                            case 1:
                                // See a media's details
                                System.out.println("Enter the title of the media: ");
                                String title = scanner.nextLine();
                                Media media = store.searchMedia(title);
                                if (media == null) {
                                    System.out.println("Media not found");
                                } else {
                                    System.out.println("Media found: " + media);
                                    mediaDetailsMenu();
                                    int mediaChoice = scanner.nextInt();
                                    scanner.nextLine(); // Consume newline
                                    switch (mediaChoice) {
                                        case 0:
                                            System.out.println("Back to store menu");
                                            break;
                                        case 1:
                                            cart.addMedia(media);
                                            System.out.println(title + " added to cart");
                                            break;
                                        case 2:
                                            if (media instanceof DigitalVideoDisc) {
                                                ((DigitalVideoDisc) media).play();
                                            } else if (media instanceof CompactDisc) {
                                                ((CompactDisc) media).play();
                                            } else {
                                                System.out.println("Cannot play this media");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                }
                                break;
                            case 2:
                                // Add a media to cart
                                System.out.println("Enter the title of the media: ");
                                String titleToAdd = scanner.nextLine();
                                Media mediaToAdd = store.searchMedia(titleToAdd);
                                if (mediaToAdd == null) {
                                    System.out.println("Media not found");
                                } else {
                                    cart.addMedia(mediaToAdd);
                                    System.out.println(titleToAdd + " added to cart");
                                    if (mediaToAdd instanceof DigitalVideoDisc) {
                                        int numDVDs = 0;
                                        for (Media m : cart.getItemsOrdered()) {
                                            if (m instanceof DigitalVideoDisc) {
                                                numDVDs++;
                                            }
                                        }
                                        System.out.println("Number of DVDs in cart: " + numDVDs);
                                    }
                                }
                                break;
                            case 3:
                                // Play a media
                                System.out.println("Enter the title of the media: ");
                                String titleToPlay = scanner.nextLine();
                                Media mediaToPlay = store.searchMedia(titleToPlay);
                                if (mediaToPlay == null) {
                                    System.out.println("Media not found");
                                } else if (mediaToPlay instanceof DigitalVideoDisc) {
                                    ((DigitalVideoDisc) mediaToPlay).play();
                                } else if (mediaToPlay instanceof CompactDisc) {
                                    ((CompactDisc) mediaToPlay).play();
                                } else {
                                    System.out.println("Cannot play this media");
                                }
                                break;
                            case 4:
                                // See current cart
                                cart.print();
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    case 2:
                        // Update store
                        System.out.println("1. Add a media to store");
                        System.out.println("2. Remove a media from store");
                        int updateChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        switch (updateChoice) {
                            case 1:
                                // Add a media to store
                                System.out.println("Enter the type of media (1. Book, 2. DVD, 3. CD): ");
                                int mediaType = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.println("Enter the title of the media: ");
                                String title = scanner.nextLine();
                                if (store.searchMedia(title) != null) {
                                    System.out.println("Media already exists");
                                    break;
                                }
                                System.out.println("Enter the ID of the media: ");
                                int id = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.println("Enter the category of the media: ");
                                String category = scanner.nextLine();
                                System.out.println("Enter the cost of the media: ");
                                float cost = scanner.nextFloat();
                                scanner.nextLine(); // Consume newline
                                if (mediaType == 1) {
                                    // Add Book
                                    System.out.println("Enter the author: ");
                                    String author = scanner.nextLine();
                                    Book book = new Book(category, cost, id, title, Collections.singletonList(author));
                                    store.addMedia(book);
                                    System.out.println(title + " added to store");
                                } else if (mediaType == 2) {
                                    // Add DVD
                                    System.out.println("Enter the director: ");
                                    String director = scanner.nextLine();
                                    System.out.println("Enter the length: ");
                                    int length = scanner.nextInt();
                                    scanner.nextLine(); // Consume newline
                                    DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                                    store.addMedia(dvd);
                                    System.out.println(title + " added to store");
                                } else if (mediaType == 3) {
                                    // Add CD
                                    System.out.println("Enter the artist: ");
                                    String artist = scanner.nextLine();
                                    CompactDisc cd = new CompactDisc(category, cost, id, title, 0, null, artist, new ArrayList<>());
                                    store.addMedia(cd);
                                    System.out.println(title + " added to store");
                                } else {
                                    System.out.println("Invalid media type");
                                }
                                break;
                            case 2:
                                // Remove a media from store
                                System.out.println("Enter the title of the media: ");
                                String titleToRemove = scanner.nextLine();
                                Media mediaToRemove = store.searchMedia(titleToRemove);
                                if (mediaToRemove != null) {
                                    store.removeMedia(mediaToRemove);
                                    System.out.println(titleToRemove + " removed from store");
                                } else {
                                    System.out.println("Media not found");
                                }
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    case 3:
                        // See current cart
                        cart.print();
                        cartMenu();
                        int cartChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        switch (cartChoice) {
                            case 0:
                                System.out.println("Back to main menu");
                                break;
                            case 1:
                                // Filter media in cart
                                System.out.println("Filter by (1. ID, 2. Title): ");
                                int filterChoice = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                switch (filterChoice) {
                                    case 1:
                                        System.out.println("Enter the ID: ");
                                        int idToFilter = scanner.nextInt();
                                        scanner.nextLine(); // Consume newline
                                        cart.filterByID(idToFilter);
                                        break;
                                    case 2:
                                        System.out.println("Enter the title: ");
                                        String titleToFilter = scanner.nextLine();
                                        cart.filterByTitle(titleToFilter);
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                }
                                break;
                            case 2:
                                // Sort media in cart
                                System.out.println("Sort by (1. Title, 2. Cost): ");
                                int sortChoice = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                switch (sortChoice) {
                                    case 1:
                                        cart.sortByTitle();
                                        break;
                                    case 2:
                                        cart.sortByCost();
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                }
                                break;
                            case 3:
                                // Remove media from cart
                                System.out.println("Enter the title of the media: ");
                                String titleToRemoveFromCart = scanner.nextLine();
                                Media mediaToRemoveFromCart = cart.searchMedia(titleToRemoveFromCart);
                                if (mediaToRemoveFromCart != null) {
                                    cart.removeMedia(mediaToRemoveFromCart);
                                    System.out.println(titleToRemoveFromCart + " removed from cart");
                                } else {
                                    System.out.println("Media not found in cart");
                                }
                                break;
                            case 4:
                                // Play a media
                                System.out.println("Enter the title of the media: ");
                                String titleToPlayFromCart = scanner.nextLine();
                                Media mediaToPlayFromCart = cart.searchMedia(titleToPlayFromCart);
                                if (mediaToPlayFromCart != null) {
                                    if (mediaToPlayFromCart instanceof DigitalVideoDisc) {
                                        ((DigitalVideoDisc) mediaToPlayFromCart).play();
                                    } else if (mediaToPlayFromCart instanceof CompactDisc) {
                                        ((CompactDisc) mediaToPlayFromCart).play();
                                    } else {
                                        System.out.println("Cannot play this media");
                                    }
                                } else {
                                    System.out.println("Media not found in cart");
                                }
                                break;
                            case 5:
                                // Place order
                                System.out.println("Order placed");
                                cart.emptyCart();
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("-----------------------");
        System.out.println("0. Exit");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-----------------------");
        System.out.println("0. Back");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}