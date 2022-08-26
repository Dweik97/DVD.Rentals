package DVD_Store.Models.Filmography;

import javax.persistence.*;

@Entity
@Table(name="language")
public class Language {

    @Id
    @Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int language_id;

    //Attributes
    private String name;

    //Empty Constructor
    public Language() {}

    //Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
