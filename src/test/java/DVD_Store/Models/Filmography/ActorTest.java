package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    void setActor_id() {
    }

    @Test
    public void test_GetFirstName(){
        Actor testActor = new Actor();
        testActor.setFirst_name("James");
        assertEquals("James", testActor.getFirst_name(), "The name didn't match");
    }

    @Test
    void setFirst_name() {
    }

    @Test
    void getLast_name() {
    }

    @Test
    void setLast_name() {
    }

    @Test
    void getLast_update() {
    }

    @Test
    void setLast_update() {
    }

    @Test
    void getFull_name() {
    }
}