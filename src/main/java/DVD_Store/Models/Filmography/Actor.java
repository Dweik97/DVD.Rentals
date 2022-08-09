package DVD_Store.Models.Filmography;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="actor")

public class Actor {

    @ManyToMany(mappedBy = "actors")
    Set<Film> acted;

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;

    //Attributes
    private String first_name, last_name;
    private Date last_update;

    public Actor(String first_name, String last_name, Date last_update) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;

    }

    //Empty Constructor
    public Actor() {
    }

    //Getter and Setters
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public void setActed(Set<Film> acted) {
        this.acted = acted;
    }
//
//    @Override
//    public String toString() {
//        return "Actor{" +
//                ", first_name='" + first_name + '\'' +
//                ", last_name='" + last_name + '\'' +
//                '}';
//    }
}

