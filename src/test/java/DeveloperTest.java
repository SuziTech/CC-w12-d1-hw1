import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Joanne", "FG 92 21 30 E",
                28936.78);
    }

    @Test
    public void developerHasName() {
        assertEquals("Joanne", developer.getName());
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals("FG 92 21 30 E", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(28936.78, developer.getSalary(), 0.01);
    }

}
