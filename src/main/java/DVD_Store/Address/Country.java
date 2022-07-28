package DVD_Store.Address;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int country_id;

    //Attributes
    private String country;
    private Date last_update;

    public Country(String country, Date last_update) {
        this.country = country;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Country() {}

    //Getter and Setters
    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
