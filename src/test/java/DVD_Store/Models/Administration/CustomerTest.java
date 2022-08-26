package DVD_Store.Models.Administration;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    Customer test = new Customer();

    @Test
    void getCustomer_id() {
        test.setCustomer_id(1);
        assertEquals(1, test.getCustomer_id(), "Mismatch");
    }

    @Test
    void getActive() {
        test.setActive(1);
        assertEquals(1, test.getActive(), "Mismatch");
    }

    @Test
    public void getFirst_name(){
        test.setFirst_name("Jamie");
        assertEquals("Jamie", test.getFirst_name(), "Mismatch");
    }


    @Test
    void getLast_name() {
        test.setLast_name("Brown");
        assertEquals("Brown", test.getLast_name(), "Mismatch");
    }

    @Test
    void getEmail() {
        test.setEmail("E-mail");
        assertEquals("E-mail", test.getEmail(), "Mismatch");
    }


    @Test
    void getCreate_date() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }


    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }
}