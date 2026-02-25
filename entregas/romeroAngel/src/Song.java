import java.util.List;

class Song {
    private int id;
    private String title;
    private int duration;
    private String fileUrl;
    private List<Artist> artists;
    private long playCount;

    public Song(int id, String title, int duration, String fileUrl, List<Artist> artists) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.fileUrl = fileUrl;
        this.artists = artists;
        this.playCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public long getPlayCount() {
        return playCount;
    }

    public void incrementPlayCount() {
        playCount++;
    }
}
