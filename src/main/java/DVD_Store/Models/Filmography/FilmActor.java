package DVD_Store.Models.Filmography;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="film_actor")
public class FilmActor {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    //Attributes
    private int actor_id;
    private Date last_update;

    public FilmActor(int actor_id, Date last_update) {
        this.actor_id = actor_id;
        this.last_update = last_update;
    }

    //Empty Constructor
    public FilmActor() {}

    //Getter and Setters
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
