package data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class QueueTest {

    @Test
    public void basicQueueTest() {
        Queue.BasicQueue basicQueue = new Queue.BasicQueue(Integer.class, 5);

        assertThat(basicQueue.dequeue()).isNull();

        basicQueue.enqueue(1);
        basicQueue.enqueue(2);
        basicQueue.enqueue(3);
        basicQueue.enqueue(4);
        basicQueue.enqueue(5);
        basicQueue.enqueue(6); // out of capacity

        assertThat(basicQueue.dequeue()).isEqualTo(1);
        assertThat(basicQueue.dequeue()).isEqualTo(2);
        assertThat(basicQueue.dequeue()).isEqualTo(3);
        assertThat(basicQueue.dequeue()).isEqualTo(4);
        assertThat(basicQueue.dequeue()).isEqualTo(5);

        assertThat(basicQueue.dequeue()).isNull();
    }
}
