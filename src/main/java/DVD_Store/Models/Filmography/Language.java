package DVD_Store.Models.Filmography;

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

    public Language(String name, Date last_update) {
        this.name = name;
    }

    //Empty Constructor
    public Language() {}

    //Getter and Setters

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
