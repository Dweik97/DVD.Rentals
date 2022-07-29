import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String IsItFriday(String today) {
        return "Friday".equals(today) ? "Yes" : "No";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("Today is Monday")
    public void today_is_Monday() {
        today = "Monday";
    }

    @Given("Today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    }

    @Given("I ask whether it's Friday")
    public void i_ask_whether_its_Friday() {
        actualAnswer = IsItFriday.IsItFriday(today);
    }

    @Given("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
