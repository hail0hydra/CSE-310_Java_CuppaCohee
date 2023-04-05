public class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist, ArrayList<Song> songs){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album(){

    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            System.out.println(title + "successfully added to the list");
            return true;
        }
    }
}
