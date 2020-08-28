import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedStringTest {

    String s = new String();

    @Test
    public void isBalancedTest() {
        s = "[({})]";
        assertTrue(BalancedString.isBalancedOptionOne(s),"Return true because string is balanced");
        assertTrue(BalancedString.isBalancedOptionTwo(s),"Return true because string is balanced");
    }

    @Test
    public void isNotBalancedTest() {
        s = "[({}";
        assertFalse(BalancedString.isBalancedOptionOne(s), "Return false because string is not balanced");
        assertFalse(BalancedString.isBalancedOptionTwo(s), "Return false because string is not balanced");
    }

}
