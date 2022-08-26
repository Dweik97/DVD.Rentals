package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FilmActorTest {

    FilmActor test = new FilmActor();

    @Test
    void getActor_id() {
        test.setActor_id(1);
        assertEquals(1, test.getActor_id(), "Mismatch");


    }

    @Test
    void getFilm_id() {
        test.setFilm_id(1);
        assertEquals(1, test.getFilm_id(), "Mismatch");

    }

    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }
}