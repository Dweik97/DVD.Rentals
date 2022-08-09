import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actor {
    private int actorId;
    //Attributes
    private String firstName;
    private String lastName;

    @Test
    public void test_getFirstName() {
        DVD_Store.Models.Filmography.Actor testActor = new DVD_Store.Models.Filmography.Actor("First", "Last", new Date());
        assertEquals("First", testActor.getFirst_name(), "Test failed.");
    }

    @Test
    public void test_setFirstName() {
        DVD_Store.Models.Filmography.Actor testActor = new DVD_Store.Models.Filmography.Actor("First", "Last", new Date());
        testActor.setFirst_name("Last");
        assertEquals("Last", testActor.getFirst_name(), "Test failed.");
    }

    @Test
    public void test_getLastName() {
        DVD_Store.Models.Filmography.Actor testActor = new DVD_Store.Models.Filmography.Actor("First", "Last", new Date());
        assertEquals("Last", testActor.getLast_name(), "Test failed.");
    }

    @Test
    public void test_setLastName() {
        DVD_Store.Models.Filmography.Actor testActor = new DVD_Store.Models.Filmography.Actor("First", "Last", new Date());
        testActor.setLast_name("Last");
        assertEquals("Last", testActor.getLast_name(), "Test failed.");
    }
}
