package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FilmCategoryTest {

    FilmCategory test = new FilmCategory();

    @Test
    void getFilm_id() {
        test.setFilm_id(1);
        assertEquals(1, test.getFilm_id(), "Mismatch");

    }

    @Test
    void getCategory_id() {
        test.setCategory_id(1);
        assertEquals(1, test.getCategory_id(), "Mismatch");
    }

    @Test
    void getLast_update() {
        Date d = new Date(2017,1,30);
        test.setLast_update(d);
        assertEquals(d, test.getLast_update(), "Mismatch");

    }

}