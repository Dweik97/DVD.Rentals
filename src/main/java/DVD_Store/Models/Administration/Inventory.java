package DVD_Store.Models.Administration;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="inventory")
public class Inventory {

//    @ManyToMany(mappedBy = "inventory")
//    Set<Film> inventor;

    @Id
    @Column(name="inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventory_id;

    //Attributes
    private int film_id, store_id;
    private Date last_update;
    private long count;


    //Empty Constructor
    public Inventory() {}

//    public Inventory(int film_id, long count) {
//
//        this.film_id = film_id;
//        this.count = count;
//    }

    //Getter and Setters
    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
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
