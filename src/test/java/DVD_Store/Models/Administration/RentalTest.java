package DVD_Store.Models.Administration;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    Rental test = new Rental();


    @Test
    void getRental_id() {
        test.setRental_id(1);
        assertEquals(1, test.getRental_id(), "Mismatch");
    }

    @Test
    void getInventory_id() {
        test.setInventory_id(1);
        assertEquals(1, test.getInventory_id(), "Mismatch");
    }

    @Test
    void getCustomer_id() {
        test.setCustomer_id(1);
        assertEquals(1, test.getCustomer_id(), "Mismatch");
    }

    @Test
    void getStaff_id() {
        test.setStaff_id(1);
        assertEquals(1, test.getStaff_id(), "Mismatch");
    }

    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");
    }

    @Test
    void getReturn_date() {
        Date d = new Date(2017,1,30);
        test.setReturn_date(d);
        assertEquals(d, test.getReturn_date(), "Mismatch");
    }

}