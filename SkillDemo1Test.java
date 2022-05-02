import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void testSubtract() {
        assertEquals(4, SkillDemo1.subtract(5, 1));
    }
}