import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> createStack() {
        Stack<String> stack = new Stack<String>(String.class, 5);
        return stack;
    }

    @Test
    void testCreateStack() {
        Stack<String> newStack = new Stack<String>(String.class, 10);

        assertNotNull(newStack);
    }

    @Test
    void testPush() {
        Stack<String> stack = createStack();
        stack.push("test");

        assertEquals("test", stack.pop());
    }
}