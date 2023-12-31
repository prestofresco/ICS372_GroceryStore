import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MemberTests {

    /**
     * Covers use case 1, 2: Adding and removing members.
     */
    public GroceryStore groceryStore = GroceryStore.instance();
    Member jackson;
    Member adan;
    Member preston;

    @Before
    public void setUp() {
        jackson = new Member("Jackson Gregoire", "123 Fake St SE Minneapolis, MN 55414",
                "612-123-4567");
    }

    @Test
    public void testAddMember() {
        // Test adding a new member
        boolean result = groceryStore.addMember(jackson);
        assertTrue("Member should be added successfully", result);
        assertEquals("Member ID counter should be incremented by 1 (Init val = 100)", 100, jackson.getMemberID());
        adan = new Member("Adan", "1234 Other St. S", "612-098-1234");
        groceryStore.addMember(adan);
        assertEquals("Member ID counter should be incremented by 1 (Init val = 100)", 101, adan.getMemberID());
    }

    @Test
    public void testRemoveMember() {
        // Test adding a new member
        boolean result = groceryStore.removeMember(jackson.getMemberID());
        System.out.println(jackson.getMemberID());
        System.out.println(result);
        assertTrue("Member should be successfully removed.", result);

        // Should probably allow access to total members in groceryStore or access to the list so we can see .size() when
        // removing members
    }
}
