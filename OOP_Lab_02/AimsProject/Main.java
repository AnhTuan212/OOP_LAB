package OOP_Lab_02.AimsProject;

public class Main {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.show();

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("1", "Tuan1", 20.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("2", "Tuan2", 21.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("3", "Tuan3", 22.99f);

        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[3];
        dvdList[0] = dvd4;
        dvdList[1] = dvd5;
        dvdList[2] = dvd6;

        anOrder.addDigitalVideoDisc(dvdList);
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.show();

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("4", "Tuan4", 23.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("5", "Tuan5", 24.99f);
        anOrder.addDigitalVideoDisc(dvd7,dvd8);
        anOrder.removeDigitalVideoDisc(dvd5);
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.show();
    }
}
