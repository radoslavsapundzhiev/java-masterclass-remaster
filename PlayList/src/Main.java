import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song> playList = new LinkedList<Song>();
        ArrayList<Album> albums = new ArrayList<Album>();

        Album beatles = new Album("Let it be");
        beatles.addSong("Two of us", 124);
        beatles.addSong("Dig a pony", 85);
        beatles.addSong("I me mine", 102);

        Album scorpians = new Album("Crazy world");
        scorpians.addSong("Don't believe her", 95);
        scorpians.addSong("Wind of change", 75);

        albums.add(beatles);
        albums.add(scorpians);

        addSongToPlayList(playList, "Smells like teen spirit", albums);
        addSongToPlayList(playList, "Two of us", albums);
        System.out.println(addSongToPlayList(playList, "Two of us", albums));
        addSongToPlayList(playList, "Don't believe her", albums);
        addSongToPlayList(playList, "Wind of change", albums);
        addSongToPlayList(playList, "Dig a pony", albums);
        addSongToPlayList(playList, "I me mine", albums);

        playSongs(playList);
    }

    private static boolean addSongToPlayList(LinkedList<Song> playlist, String songTitle, ArrayList<Album> albums) {
        int[] position = findSongInAlbums(songTitle, albums);
        if(position != null) {
            Song song = albums.get(position[0]).getSongs().get(position[1]);
            if(findSongInPlayList(songTitle, playlist) < 0) {
                playlist.add(song);
                return true;
            } else {
                return false;
            }

        }else{
            System.out.println("Song with name " + songTitle + " is not present in albums.");
            return false;
        }
    }

    private static int[] findSongInAlbums(String songTitle, ArrayList<Album> albums) {
        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            ArrayList<Song> songs = album.getSongs();
            for (int j = 0; j < songs.size(); j++) {
                Song song = songs.get(j);
                if(song.getTitle().equals(songTitle)){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    private static int findSongInPlayList(String songTitle, LinkedList<Song> playList) {
        for (int i = 0; i < playList.size(); i++) {
            if(playList.get(i).getTitle().equals(songTitle)){
                return i;
            }
        }
        return -1;
    }

    private static void playSongs(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.isEmpty()){
            System.out.println("No songs available to play in playList.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Stop playing songs.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Playlist is over. You are at the end of the playList.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("You are at the start of the playList");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().getTitle());
                        }
                    } else {
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                        }
                    }
                    goingForward = !goingForward;
                    break;
                case 4:
                    listSongs(playList);
                    break;
                case 5:
                    listIterator.remove();
                    System.out.println("Current song has been removed");
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void listSongs(LinkedList<Song> playList){
        for (int i = 0; i < playList.size(); i++) {
            Song song = playList.get(i);
            System.out.println("Title: " + song.getTitle() + ", duration: " + song.getDuration());
        }
    }

    private static void printMenu() {
        System.out.println("Choose option from menu:\n");
        System.out.println("0 - to quit\n" +
                "1 - skip forward\n" +
                "2 - skip backwards\n" +
                "3 - replay current song\n"+
                "4 - list songs in the playlist\n" +
                "5 - remove song\n" +
                "6 - print menu options");
    }
}
