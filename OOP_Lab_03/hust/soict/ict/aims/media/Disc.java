package OOP_Lab_03.hust.soict.ict.aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    public Disc(){
    //Constructor
    }

    public Disc(String category, float cost, int id, String title, int length, String director) {
        super(category, cost, id, title);
        this.length = length;
        this.director = director;
    }

    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Disc: " +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cost=" + getCost() +
                ", director='" + director + '\'' +
                ", length=" + length;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}
