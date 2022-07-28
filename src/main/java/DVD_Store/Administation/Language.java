package DVD_Store.Administation;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="language")
public class Language {

    @Id
    @Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int language_id;

    //Attributes
    private String name;
    private Date last_update;

    public Language(String name, Date last_update) {
        this.name = name;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Language() {}

    //Getter and Setters
    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
