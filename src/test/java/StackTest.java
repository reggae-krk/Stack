import CustomExceptions.EmptyStackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> createStack() {
        Stack<String> stack = new Stack<String>(String.class, 5);
        stack.push("test0");
        stack.push("test1");
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

        assertEquals("test1", stack.pop());
    }

    @Test
    void testPushWhenStackIsFull() {
        Stack<String> stack = createStack();
        stack.push("test2");
        stack.push("test3");
        stack.push("test4");

        assertThrows(StackOverflowError.class, () -> stack.push("full"));
    }

    @Test
    void testPop() {
        Stack<String> stack = createStack();

        assertEquals("test1", stack.pop());
        assertEquals("test0", stack.pop());
    }

    @Test
    void testPopWhenStackIsEmpty() {
        Stack<String> stack = new Stack<String>(String.class, 5);

        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testPeek() {
        Stack<String> stack = createStack();

        assertEquals("test1", stack.peek());
    }

    @Test
    void testGetMaxSize() {
        Stack<String> stack = createStack();

        assertEquals(5, stack.getMaxSize());
    }

    @Test
    void testSpaceLeft() {
        Stack<String> stack = createStack();

        assertEquals(3, stack.spaceLeft());
    }
}