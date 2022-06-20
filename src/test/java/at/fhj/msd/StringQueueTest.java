package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
/**
 * This is the StringQueueTest class
 * @author Vinzent Schmid
 */
public class StringQueueTest {

    private StringQueue queue;

    /**
     * Setup for the test class with a StringQueue Object
     */
    @BeforeEach
    public void setup(){
        queue = new StringQueue(1);
    }
    /**
     * Test if its possible to add an offerTest String.
     * So if it is possible it should return true
     */
    @Test
    public void offerTest(){
        Assertions.assertTrue(queue.offer("offerTest"));
    }
    /**
     * Test if its possible to add two offerTest Strings.
     * Since it is not possible it returns false
     */
    @Test
    public void offerTest1(){
        String offerTest = "offerTest";
        String offerTest1 = "offerTest1";
        queue.offer(offerTest);
        Assertions.assertFalse(queue.offer(offerTest1));
    }
    /**
     * It should be null, because of its null
     */
    @Test
    public void pollTest(){
        Assertions.assertNull(queue.poll());
    }
    /**
     *  Queue is not empty, so string should be the same
     */
    @Test
    public void pollTest1(){
        String pollTest = "pollTest";
        queue.offer(pollTest);
        Assertions.assertEquals(pollTest, queue.poll());
    }
    /**
     *   Removes first element, and check if this works
     */
    @Test
    public void removeTest(){
        String removeTest = "removeTest";
        queue.offer(removeTest);
        Assertions.assertEquals(removeTest, queue.remove());
    }
    /**
     *   Removes first element, but there is no element in queue it return NoSuchElemntException
     */
    @Test
    public void removeTest1(){
       Assertions.assertThrows(NoSuchElementException.class, ()-> queue.remove());
    }
    /**
     *   Try to get first element in queue, and check if it is equal
     */
    @Test
    public void peekTest(){
        String peekTest = "peekTest";
        queue.offer(peekTest);
        Assertions.assertEquals(peekTest, queue.peek());
    }
    /**
     *   Try to get first element in queue, but queue is null, so it returns null
     */
    @Test
    public void peekTest1(){
        Assertions.assertNull(queue.peek());
    }
    /**
     *   Try to get first element in queue, and check if it is equal
     */
    @Test
    public void elementTest(){
        String elementTest = "elementTest";
        queue.offer(elementTest);
        Assertions.assertEquals(elementTest, queue.element());
    }
    /**
     *   Try to get first element in queue, but queue is null, so it throws NoSuchElementException
     */
    @Test
    public void elementTest1(){
        Assertions.assertThrows(NoSuchElementException.class, ()-> queue.element());
    }
}
