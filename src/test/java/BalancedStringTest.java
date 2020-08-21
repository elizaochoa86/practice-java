import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedStringTest {

    String s = new String();

    @Test
    public void isBalancedTest() {
        s = "[({})]";
        assertTrue(BalancedString.isBalancedOptionOne(s));
        assertTrue(BalancedString.isBalancedOptionTwo(s));
    }

    @Test
    public void isNotBalancedTest() {
        s = "[({}";
        assertFalse(BalancedString.isBalancedOptionOne(s));
        assertFalse(BalancedString.isBalancedOptionTwo(s));
    }

}
