package DVD_Store.Filmography;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;

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
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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
