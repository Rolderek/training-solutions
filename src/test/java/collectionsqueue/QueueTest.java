package collectionsqueue;



import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;


class QueueTest {

    @Test
    public void testQueue() {
        //fifo
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int i = q.element();
        assertEquals(i, 1);

        i = q.remove();
        assertEquals(i, 1);

        i = q.remove();
        assertEquals(i, 2);

        assertEquals(q.isEmpty(), true);

    }

    @Test
    public void testDequeue() {
        //lifo
        Deque<Integer> d = new LinkedList<>();
        d.push(1);
        d.push(2);
        d.push(3);

        int i = d.peek();
        assertEquals(i, 3);
        i = d.pop();
        assertEquals(i, 3);
        i = d.pop();
        assertEquals(i, 2);
        i = d.pop();
        assertEquals(i, 1);


    }

}