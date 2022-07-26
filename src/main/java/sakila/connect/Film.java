package sakila.connect;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    //Attributes
    private String title;
    private double replacement_cost;

    public Film(String title, double replacement_cost){
        this.title=title;
        this.replacement_cost=replacement_cost;
    }

    //Empty Constructor
    public Film() {}

    //Getters and Setters
    public int getFilm_id() {return film_id;}
    public void setFilm_id(int film_id) {this.film_id = film_id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getReplacement_cost() {return replacement_cost;}
    public void setReplacement_cost(double replacement_cost) {this.replacement_cost = replacement_cost;}
}
