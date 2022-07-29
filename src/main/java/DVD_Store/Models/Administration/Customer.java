package DVD_Store.Models.Administration;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    //Attributes
    private int store_id, active;
    private String first_name, last_name, email;
    private Date create_date, last_update;

    public Customer(int store_id, String first_name, String last_name, String email, Date create_date, Date last_update, int active) {
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.create_date = create_date;
        this.last_update = last_update;
        this.active = active;
    }

    //Empty Constructor
    public Customer() {}

    //Getter and Setters

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getActive() {
        return active;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public int isActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
