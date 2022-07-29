package DVD_Store.Models.Filmography;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="film_category")
public class FilmCategory {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    //Attributes
    private int category_id;
    private Date last_update;

    public FilmCategory(int category_id, Date last_update) {
        this.category_id = category_id;
        this.last_update = last_update;
    }

    //Empty Constructor
    public FilmCategory() {}

    //Getter and Setters

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}

