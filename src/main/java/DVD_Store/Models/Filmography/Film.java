package DVD_Store.Models.Filmography;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="film")
public class Film {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    //Attributes
    private String title, description, rating, special_features;
    private int language_id, release_year, rental_duration, length;
    private double replacement_cost, rental_rate;
    private Date last_update;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))

    Set<Actor> actors;

    public Film(String title, String description, String rating, String special_features, int language_id, int release_year, int rental_duration, double rental_rate, int length, double replacement_cost, Date last_update) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.special_features = special_features;
        this.language_id = language_id;
        this.release_year = release_year;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Film() {}

    //Getters and Setters


    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actedIn) {
        this.actors = actedIn;
    }
}

