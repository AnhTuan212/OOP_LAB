package OOP_Lab_03.hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title) {
        setTitle(title);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        setCategory(category);
        setTitle(title);
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        setTitle(title);
        setCategory(category);
        this.director = director;
        this.length = length;
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs += 1;
    }

    // Function for Lab03
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + ": " + getCost() + " $";
    }

    public boolean isMatch(String title) {
        return title.equals(getTitle());
    }
    //Constructor
    public DigitalVideoDisc(String director, int length) {
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String category, float cost, int id, String title, int length, String director) {
        super(category, cost, id, title, length, director);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}