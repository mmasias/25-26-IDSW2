import java.time.LocalDate;
import java.util.List;

class Album {
    private int id;
    private String title;
    private LocalDate releaseDate;
    private List<Song> songs;
    private List<Artist> artists;
    private String coverUrl;
}
