package music;

import java.util.*;

public class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs; // dynamic array

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album(){

    }

    public Song findSong(String title){

        for(Song checkedSong : songs){
            if (checkedSong.getTitle().equals(title)) return checkedSong; 
        }

        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            //System.out.println(title + "successfully added to the list");
            return true;
        }
        else {
            // System.out.println("Song with name " + title + " already exists in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){ // 2nd arg is linked list of PlayList
        int index = trackNumber - 1; // index starts from 0 but track from 1

        if (index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        // System.out.println("this Album doesn't have song with trackNumber "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for (Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
        // System.out.println(title + "there is no suck song in album");
        return false;
    }
}
