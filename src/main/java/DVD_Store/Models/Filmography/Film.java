package DVD_Store.Models.Filmography;

import org.hibernate.annotations.Formula;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="film")
public class Film {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="release_year")
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name="language_id", nullable=false, insertable = false, updatable = false)
    private Language language;

    @Column(name="language_id", nullable=false)
    private Integer language_id;

    @Column(name="original_language_id")
    private Integer originalLanguageId;

    @Column(name="rental_duration")
    private Integer rentalDuration;

    @Column(name="rental_rate")
    private BigDecimal rentalRate;

    @Column(name="length")
    private Integer length;

    @Column(name="replacement_cost")
    private BigDecimal replacementCost;

    @Column(name="rating")
    private String rating;

    @Column(name="special_features")
    private String specialFeatures;

     @Formula("(select " +
            "(select COUNT(i.film_id) from inventory i where i.film_id= film_id) - " +
            "(select COUNT(i.inventory_id) FROM inventory i INNER JOIN rental r ON " +
             "i.inventory_id = r.inventory_id WHERE r.return_date IS NULL AND i.film_id = film_id))")
    private Integer availableCopies;


    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))

    Set<Actor> actors;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))

    Set<Category> category;

    public Film(int film_id, String title, String description, Integer releaseYear, Language originalLanguage, Integer originalLanguageId, Integer rentalDuration, BigDecimal rentalRate, Integer length, BigDecimal replacementCost, String rating, String specialFeatures) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
    }

    //Empty Constructor
    public Film() {}

    //Getters and Setters

    public int getFilm_id() {
        return film_id;
    }
    public String getTitle() {
        return title;
    }
    public Language getLanguage() {
        return language;
    }
    public String getDescription() {
        return description;
    }
    public Integer getReleaseYear() {
        return releaseYear;
    }
    public Integer getRentalDuration() {
        return rentalDuration;
    }
    public BigDecimal getRentalRate() {
        return rentalRate;
    }
    public Integer getLength() {
        return length;
    }
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }
    public String getRating() {
        return rating;
    }
    public String getSpecialFeatures() {
        return specialFeatures;
    }
    public Integer getAvailableCopies() {
        return availableCopies;
    }
    public Set<Category> getCategory() {
    return category;
    }
    public Set<Actor> getActors() {
        return actors;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setLanguage_id(Integer languageId) {
        this.language_id = languageId;
    }
    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }
    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }
    public void setLength(Integer length) {
        this.length = length;
    }
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    public void setCategory(Set<Category> category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }
}

