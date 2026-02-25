import java.time.LocalDate;
import java.util.List;

class Album {
    private int id;
    private String title;
    private LocalDate releaseDate;
    private List<Song> songs;
    private List<Artist> artists;
    private String coverUrl;

    public Album(int id, String title, LocalDate releaseDate, List<Song> songs, List<Artist> artists, String coverUrl) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>();
        this.artists = artists;
        this.coverUrl = coverUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Artist> getArtists() {
        return artists;
    }   

    public String getCoverUrl() {
        return coverUrl;
    }

    public void addSong(Song song) {
        if(song!=null){
            songs.add(song);
        }
    }

    @Override
    public String toString() {          
        return "Title: " + title + '\n' +
                "Release Date: " + releaseDate +
                "Songs(" + songs.size() + ")" + for (Song song : songs) {
                    sb.append("\n  - ").append(song.getTitle());
                } + "\n" + 
                "Artists" + for (Artist artist : artists) {
                    sb.append("\n  - ").append(artist.getName());
                }   + "\n" +
                "Cover URL: " + coverUrl + "\n";
    }

}
