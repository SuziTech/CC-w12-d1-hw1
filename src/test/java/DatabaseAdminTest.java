import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Mary", "EY 07 86 34 N",
                34590.00);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Mary", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber() {
        assertEquals("EY 07 86 34 N", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(34590.00, databaseAdmin.getSalary(), 0.01);
    }

}
