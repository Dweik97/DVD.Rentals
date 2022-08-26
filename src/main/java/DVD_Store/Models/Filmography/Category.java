package DVD_Store.Models.Filmography;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;

    @ManyToMany(mappedBy = "category")
    Set<Film> categories;

    //Attributes
    private String name;

    //Empty Constructor
    public Category() {}

    //Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
