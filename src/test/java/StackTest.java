import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testCreateStack() {
        Stack<String> newStack = new Stack<String>(String.class, 10);

        assertNotNull(newStack);
    }

}