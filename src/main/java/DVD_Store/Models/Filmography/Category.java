package DVD_Store.Models.Filmography;
import javax.persistence.*;
import java.util.Date;
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
    private Date last_update;

    public Category(String name, Date last_update) {
        this.name = name;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Category() {}

    //Getter and Setters

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
