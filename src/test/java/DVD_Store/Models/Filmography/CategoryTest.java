package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category test = new Category();

    @Test
    void getName() {
        test.setName("Jamie");
        assertEquals("Jamie", test.getName(), "Mismatch");
    }
}