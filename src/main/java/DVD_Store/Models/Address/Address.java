package DVD_Store.Models.Address;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="address")
public class Address {

    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;

    //Attributes
    private String address, district;
    private int city_id, postal_code;
    private long phone;
    private Date last_update;
//    private BlobType location;

    public Address(String address, String district, int city_id, int postal_code, int phone, Date last_update) {
        this.address = address;
        this.district = district;
        this.city_id = city_id;
        this.postal_code = postal_code;
        this.phone = phone;
        this.last_update = last_update;
    }

    //Empty Constructor
    public Address() {}

    //Getters and Setters
    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
