package DVD_Store.Address;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="city")
public class City {

    @Id
    @Column(name="city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;

    //Attributes
    private String city;
    private int country_id;
    private Date last_update;

    public City(String city, int country_id, Date last_update) {
        this.city = city;
        this.country_id = country_id;
        this.last_update = last_update;
    }

    //Empty Constructor
    public City() {}

   //Getter and Setters
    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
