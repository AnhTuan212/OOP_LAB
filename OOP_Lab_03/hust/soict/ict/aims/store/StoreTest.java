package OOP_Lab_03.hust.soict.ict.aims.store;
import OOP_Lab_03.hust.soict.ict.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "Wachowski", 136, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Nolan", 148, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather", "Drama", "Coppola", 175, 29.99f);

//        store.addDVD(dvd1);
//        store.addDVD(dvd2);
//        store.addDVD(dvd3);
//
//        store.printStore();
//
//        store.removeDVD(dvd2);

        store.printStore();
    }
}
