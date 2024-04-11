import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {
    private String title;
    private String artist;
    private Set<String> listeners;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.listeners = new HashSet<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> newListeners) {
        int initialSize = listeners.size();
        newListeners.forEach(listener -> listeners.add(listener.toLowerCase()));
        return listeners.size() - initialSize;
    }
}