package DVD_Store.Models.Administration;

import DVD_Store.Models.Filmography.Film;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="inventory")
public class Inventory {

    @Id
    @Column(name="inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventory_id;

    //Attributes
    private int store_id;

    @ManyToOne
    @JoinColumn(name="film_id")
    private Film inv;

    private Date last_update;

    //Empty Constructor
    public Inventory() {}

    //Getter and Setters
    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
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
