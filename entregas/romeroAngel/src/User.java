import java.time.LocalDate;
import java.util.List;

class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String country;
    private LocalDate registerDate;
    private List<Profile> profiles;
    private Subscription subscription;
}
