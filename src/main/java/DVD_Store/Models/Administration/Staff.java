package DVD_Store.Models.Administration;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="staff")
public class Staff {

    @Id
    @Column(name="staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staff_id;

    //Attributes
    private String first_name, last_name, email, username, password;
    private int address_id, active, store_id;
    private Date last_update;
    //private BlobType picture;

    public Staff(String first_name, String last_name, String email, String username, String password, int address_id, int active, int store_id, Date last_update) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address_id = address_id;
        this.active = active;
        this.store_id = store_id;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Staff() {}

    //Getters and Setters
    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
