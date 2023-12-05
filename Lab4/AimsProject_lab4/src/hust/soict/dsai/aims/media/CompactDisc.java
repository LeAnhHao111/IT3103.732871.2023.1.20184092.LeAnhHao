// Họ và tên: Lê Anh Hào
// MSSV: 20184092

package AimsProject_lab4.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(String title, float cost) {
        super(title, cost);
    }
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks.addAll(tracks);
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {   
            System.out.println("Existed");
        } else {    
            tracks.add(track);
            System.out.println("Added successfully");
        }
    }

    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {  
            System.out.println("No found");
        } else {
            tracks.remove(track);  
            System.out.println("Removed successfully");
        }
    }
// Le Anh Hao
    public void play() {
        for (Track track : tracks) {
            track.play();       
        }
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {    
            length += track.getLength();    
        }
        return length;
    }

    @Override
    public String toString() {
        return String.format("CD - %s - %s - %s - %d: $%f",
                getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }
}