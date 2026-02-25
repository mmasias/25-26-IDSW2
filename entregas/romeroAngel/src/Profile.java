import java.util.List;

class Profile {
    private int id;
    private String nickname;
    private boolean isPrivate;
    private List<Playlist> myPlaylists;
    private List<Playlist> followedPlaylists;
    private List<Artist> followedArtists;
    private List<Profile> following;
    private List<Profile> followers;
    private String avatarUrl;
}
