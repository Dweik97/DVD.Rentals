package DVD_Store.Models.Administration;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventoryTest {

    Inventory test = new Inventory();

    @Test
    void getInventory_id() {
        test.setInventory_id(1);
        assertEquals(1, test.getInventory_id(), "Mismatch");
    }

    @Test
    void getStore_id() {
        test.setStore_id(1);
        assertEquals(1, test.getStore_id(), "Mismatch");
    }

    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");
    }
}