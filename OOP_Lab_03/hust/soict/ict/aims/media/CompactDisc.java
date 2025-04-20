package OOP_Lab_03.hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String artist, ArrayList<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String category, float cost, int id, String title, int length, String director, String artist, List<Track> tracks) {
        super(category, cost, id, title, length, director);
        this.artist = artist;
        this.tracks = (ArrayList<Track>) tracks;
    }

    public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(){
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track '" + track.getTitle() + "' is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' has been added.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track '" + track.getTitle() + "' has been removed.");
            tracks.remove(track);
        } else {
            System.out.println("Track '" + track.getTitle() + "' is not in the list.");
        }
    }
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
