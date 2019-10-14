import org.junit.Before;
import org.junit.Test;

import management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Fred", "DA 34 65 78 T",
                45675.34, "IT");
    }

    @Test
    public void managerHasName() {
        assertEquals("Fred", manager.getName());
    }

    @Test
    public void managerHasNiNumber() {
        assertEquals("DA 34 65 78 T", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(45675.34, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHsaDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void managerReceivesSalaryRise() {
        manager.raiseSalary(3000.00);
        assertEquals(48675.34, manager.getSalary(), 0.01);
    }

    @Test
    public void managerReceivesBonus() {
        assertEquals(456.75, manager.payBonus(), 0.01);
    }
}