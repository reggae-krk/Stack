import CustomExceptions.EmptyStackException;
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

    @Test
    void testPop() {
        Stack<String> stack = createStack();
        stack.push("test0");
        stack.push("test1");

        assertEquals("test1", stack.pop());
        assertEquals("test0", stack.pop());
    }

    @Test
    void testPopWhenStackIsEmpty() {
        Stack<String> stack = createStack();

        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testPeek() {
        Stack<String> stack = createStack();
        stack.push("test0");

        assertEquals("test0", stack.peek());
    }
}