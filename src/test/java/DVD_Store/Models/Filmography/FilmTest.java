package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    Film test = new Film();

    @Test
    void getFilm_id() {
        test.setFilm_id(1);
        assertEquals(1, test.getFilm_id(), "Mismatch");
    }

    @Test
    void getTitle() {
        test.setTitle("Title");
        assertEquals("Title", test.getTitle(), "Mismatch");
    }

    @Test
    void getDescription() {
        test.setDescription("Description");
        assertEquals("Description", test.getDescription(), "Mismatch");
    }

    @Test
    void getReleaseYear() {
        test.setReleaseYear(2005);
        assertEquals(2005, test.getReleaseYear(), "Mismatch");
    }

    @Test
    void getRentalDuration() {
        test.setRentalDuration(108);
        assertEquals(108, test.getRentalDuration(), "Mismatch");
    }

    @Test
    void getRentalRate() {
        test.setRentalRate(BigDecimal.valueOf(10.99));
        assertEquals(BigDecimal.valueOf(10.99), test.getRentalRate(), "Mismatch");
    }

    @Test
    void getLength() {
        test.setLength(108);
        assertEquals(108, test.getLength(), "Mismatch");
    }

    @Test
    void getReplacementCost() {
        test.setReplacementCost(BigDecimal.valueOf(10.99));
        assertEquals(BigDecimal.valueOf(10.99), test.getReplacementCost(), "Mismatch");
    }

    @Test
    void getRating() {
        test.setRating("Rating");
        assertEquals("Rating", test.getRating(), "Mismatch");
    }

    @Test
    void getSpecialFeatures() {
        test.setSpecialFeatures("Special");
        assertEquals("Special", test.getSpecialFeatures(), "Mismatch");
    }

    @Test
    void getAvailableCopies() {
        test.setAvailableCopies(108);
        assertEquals(108, test.getAvailableCopies(), "Mismatch");
    }

    @Test
    void getCategory() {
        test.setSpecialFeatures("Category");
        assertEquals("Category", test.getSpecialFeatures(), "Mismatch");
    }

    @Test
    void getLanguage_id() {
        test.setLanguage_id(108);
        assertEquals(108, test.getLanguage_id(), "Mismatch");
    }

    @Test
    void getOriginalLanguageId() {
        test.setOriginalLanguageId(108);
        assertEquals(108, test.getOriginalLanguageId(), "Mismatch");
    }
}