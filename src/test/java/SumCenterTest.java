import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumCenterTest {
    List<Integer> s;

    @Test
    public void sumCenterOptionOneTest() {
        s = Arrays.asList(1, 2, 3, 10, 4, -16);
        assertEquals(Optional.of(2), SumCenter.sumCenterOptionOne(s),
                "Return a value that left sum is equal to right sum");
    }

    @Test
    public void sumCenterEmptyOptionOneTest() {
        s = Arrays.asList(1, 2, 3, 5, 4, 10);
        assertEquals(Optional.empty(), SumCenter.sumCenterOptionOne(s),
                "Return empty because left sum is not equal to right sum");
    }

    @Test
    public void sumCenterOptionTwoTest() {
        s = Arrays.asList(1, 2, 3, 10, 4, 2);
        assertEquals(Optional.of(10), SumCenter.sumCenterOptionTwo(s),
                "Return a value that left sum is equal to right sum");
    }

    @Test
    public void sumCenterEmptyOptionTwoTest() {
        s = Arrays.asList(1, 2, 3, 5, 4, 10);
        assertEquals(Optional.empty(), SumCenter.sumCenterOptionTwo(s),
                "Return empty because left sum is not equal to right sum");
    }
}
