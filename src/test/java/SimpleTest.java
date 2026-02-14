import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTest {
    @Test
    void testLogic() {
        int sum = 10 + 10;
        assertEquals(20, sum, "Math should work!");
    }
}
