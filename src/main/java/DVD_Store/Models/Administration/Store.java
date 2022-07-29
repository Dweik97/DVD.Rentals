package DVD_Store.Models.Administration;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="store")
public class Store {

    @Id
    @Column(name="store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int store_id;

    //Attributes
    private int manager_staff_id, address_id;
    private Date last_update;

    public Store(int manager_staff_id, int address_id, Date last_update) {
        this.manager_staff_id = manager_staff_id;
        this.address_id = address_id;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Store() {}

    //Getters and Setters
    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(int manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
