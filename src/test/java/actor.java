import DVD_Store.Models.Filmography.Actor;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class actor {
    private int actorId;
    //Attributes
    private String firstName;
    private String lastName;

    @Test
    public void test_getFirstName() {
        Actor testActor = new Actor("First", "Last", new Date());
        assertEquals("First", testActor.getFirst_name(), "Test failed.");
    }

    @Test
    public void test_setFirstName() {
        Actor testActor = new Actor("First", "Last", new Date());
        testActor.setFirst_name("Last");
        assertEquals("Last", testActor.getFirst_name(), "Test failed.");
    }

    @Test
    public void test_getLastName() {
        Actor testActor = new Actor("First", "Last", new Date());
        assertEquals("Last", testActor.getLast_name(), "Test failed.");
    }

    @Test
    public void test_setLastName() {
        Actor testActor = new Actor("First", "Last", new Date());
        testActor.setLast_name("Last");
        assertEquals("Last", testActor.getLast_name(), "Test failed.");
    }
}
