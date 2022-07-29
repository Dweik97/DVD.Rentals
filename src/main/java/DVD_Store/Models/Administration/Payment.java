package DVD_Store.Models.Administration;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="payment")
public class Payment {

    @Id
    @Column(name="payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;

    //Attributes
    private int customer_id, staff_id, rental_id;
    private double amount;
    private Date payment_date, last_update;

    public Payment(int customer_id, int staff_id, int rental_id, double amount, Date payment_date, Date last_update) {
        this.customer_id = customer_id;
        this.staff_id = staff_id;
        this.rental_id = rental_id;
        this.amount = amount;
        this.payment_date = payment_date;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Payment() {}

    //Getter and Setters
    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
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

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
