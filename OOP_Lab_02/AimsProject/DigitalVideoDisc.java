package OOP_Lab_02.AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs +=1;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs +=1;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs +=1;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs +=1;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
