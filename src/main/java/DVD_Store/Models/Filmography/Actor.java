package DVD_Store.Models.Filmography;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="actor")

public class Actor {

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;
    
    @Formula("concat(first_name, ' ', last_name)")
    private String full_name;

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

//    public void setActed(Set<Film> acted) {
//        this.acted = acted;
//    }

    public String getFull_name() {
        return full_name;
    }

}