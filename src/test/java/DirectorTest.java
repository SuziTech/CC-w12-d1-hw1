import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
        Director director;

        @Before
        public void before() {
            director = new Director("Sybil", "SZ 12 84 57 U",
                    135675.34, "Infrastructure & Legal", 1500000);
        }

        @Test
        public void directorHasName() {
            assertEquals("Sybil", director.getName());
        }

        @Test
        public void directorHasNiNumber() {
            assertEquals("SZ 12 84 57 U", director.getNiNumber());
        }

        @Test
        public void directorHasSalary() {
            assertEquals(135675.34, director.getSalary(), 0.01);
        }

        @Test
        public void directorHsaDeptName() {
            assertEquals("Infrastructure & Legal", director.getDeptName());
        }

        @Test
        public void directorReceivesSalaryRise() {
            director.raiseSalary(5000.00);
            assertEquals(140675.34, director.getSalary(), 0.01);
        }

        @Test
        public void directorReceivesBonus() {
            assertEquals(1356.75, director.payBonus(), 0.01);
        }

    @Test
    public void directorHasBudget() {
        assertEquals(1500000.00, director.getBudget(), 0.01);
    }
}

