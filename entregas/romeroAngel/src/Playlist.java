import java.time.LocalDate;
import java.util.List;

class Playlist {
    private int id;
    private String title;
    private String description;
    private String coverUrl;
    private boolean isPublic;
    private List<Song> songs;
    private Profile owner;
    private LocalDate creationDate;
    private List<Profile> followers;
}
