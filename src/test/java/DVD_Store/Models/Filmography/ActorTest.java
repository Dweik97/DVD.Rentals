package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActorTest {

    Actor test = new Actor();

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
    void getLast_update() {

        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }

}