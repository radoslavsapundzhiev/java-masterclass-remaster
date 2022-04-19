import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, int duration) {
        int position = findSong(title);
        if(position >= 0) {
            return false;
        } else {
            this.songs.add(Song.createSong(title, duration));
            return true;
        }
    }

    private int findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if(song.getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }
}
