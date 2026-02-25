import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

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

    public Playlist(int id, String title, Profile owner, boolean isPublic) {
        this.id = id;
        this.title = title;
        this.description = "";
        this.coverUrl = "";
        this.isPublic = isPublic;
        this.songs = new ArrayList<>();
        this.owner = owner;
        this.creationDate = LocalDate.now();
        this.followers = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public List<Song> getSongs() {
        return songs;
    }
    
    public List<Profile> getFollowers() {
        return followers;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getCoverUrl() {
        return coverUrl;
    }
    
    public boolean isPublic() {
        return isPublic;
    }
    
    public Profile getOwner() {
        return owner;
    }
    
    public LocalDate getCreationDate() {
        return creationDate;
    }
    

    public void addSong(Profile profile, Song song) {
        if(profile.getId()==this.owner.getId() && song!=null){
            songs.add(song);
        }
    }

    public void removeSong(Profile profile, Song song) {
        if(profile.getId()==this.owner.getId() && song!=null){
            songs.remove(song);
        }
    }

    public void follow(Profile profile) {
        if(profile!=null && !followers.contains(profile)){
            followers.add(profile);
        }
    }

    public void unfollow(Profile profile) {
        if(profile!=null && followers.contains(profile)){
            followers.remove(profile);
        }
    }

    public void setDescription(Profile profile, String description) {
        if(profile.getId()==this.owner.getId() && description!=null){
            this.description = description;
        }
    }

    public void setName(Profile profile, String name) {
        if(profile.getId()==this.owner.getId() && name!=null){
            this.title = name;
        }
    }

    public void setCoverUrl(Profile profile, String coverUrl) {
        if(profile.getId()==this.owner.getId() && coverUrl!=null){
            this.coverUrl = coverUrl;
        }
    }

    public void togglePrivacy(Profile profile) {
        if(profile.getId()==this.owner.getId()){
            this.isPublic = !this.isPublic;
        }
    }

}
