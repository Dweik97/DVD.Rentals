package DVD_Store.Models.Administration;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="rental")
public class Rental {

    @Id
    @Column(name="rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rental_id;

    //Attributes
    private int inventory_id, customer_id, staff_id;
    private Date rental_date, last_update, return_date;

    public Rental(int inventory_id, int customer_id, int staff_id, Date rental_date, Date last_update, Date return_date) {
        this.inventory_id = inventory_id;
        this.customer_id = customer_id;
        this.staff_id = staff_id;
        this.rental_date = rental_date;
        this.last_update = last_update;
        this.return_date = return_date;
    }


    //Empty Constructor
    public Rental() {}

    //Getters and Setters

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public Date getRental_date() {
        return rental_date;
    }

    public void setRental_date(Date rental_date) {
        this.rental_date = rental_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
