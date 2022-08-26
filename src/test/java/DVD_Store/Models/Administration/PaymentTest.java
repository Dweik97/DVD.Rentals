package DVD_Store.Models.Administration;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    Payment test = new Payment();


    @Test
    void getPayment_id() {
        test.setPayment_id(1);
        assertEquals(1, test.getPayment_id(), "Mismatch");
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
    void getRental_id() {
        test.setRental_id(1);
        assertEquals(1, test.getRental_id(), "Mismatch");
    }

    @Test
    void getAmount() {
        test.setAmount(BigDecimal.valueOf(10.99));
        assertEquals(BigDecimal.valueOf(10.99), test.getAmount(), "Mismatch");
    }

    @Test
    void getPayment_date() {
        Date d = new Date(2017,1,30);
        test.setPayment_date(d);
        assertEquals(d, test.getPayment_date(), "Mismatch");

    }

    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }

}