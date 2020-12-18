package data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StackTest {

    @Test
    public void stackAPITest() {
        Stack<String> stringStack = new Stack<>(String.class, 5);

        assertThat(stringStack.pop()).isNull();

        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");
        stringStack.push("4");
        stringStack.push("5");
        stringStack.push("6"); // out of capacity

        assertThat(stringStack.pop()).isEqualTo("5");
        assertThat(stringStack.pop()).isEqualTo("4");
        assertThat(stringStack.pop()).isEqualTo("3");
        assertThat(stringStack.pop()).isEqualTo("2");
        assertThat(stringStack.pop()).isEqualTo("1");

        assertThat(stringStack.pop()).isNull();
    }
}
