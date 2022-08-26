package DVD_Store.Models.Filmography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageTest {

    Language test = new Language();

    @Test
    void getName() {
        test.setName("Name");
        assertEquals("Name", test.getName(), "Mismatch");
    }

}