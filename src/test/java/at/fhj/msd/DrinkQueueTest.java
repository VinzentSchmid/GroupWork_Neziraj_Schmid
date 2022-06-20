package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

/**
 * test class for testing the DrinkQueue
 * @author Emanuel Neziraj
 */
public class DrinkQueueTest {
    /**
     * Create Object DrinkQueue
     */
    private DrinkQueue queue;
    /**
     * Create Object Drink
     */
    private Drink cola;
    /**
     * Create Object Drink
     */
    private Drink irishWhisky;
    /**
     * Create Object Drink
     */
    private Drink bourbon;
    /**
     * Create Object Drink
     */
    private Drink scotch;

    /**
     * Test Setup creates assigns the created variables to new objects
     */
    @BeforeEach
    public void setup(){
        queue = new DrinkQueue(2);
        Liquid whisky = new Liquid("Whisky", 2, 40);
        irishWhisky = new SimpleDrink("Irish Whisky", whisky);
        bourbon = new SimpleDrink("Bourbon", whisky);
        scotch = new SimpleDrink("Scotch", whisky);
        cola = new SimpleDrink("Coke", new Liquid("Coca Cola", 25, 0));
    }

    /**
     * tests if method offer returns true when object is added to queue
     */
    @Test
    public void offerTest(){
        Assertions.assertTrue(queue.offer(irishWhisky));
    }

    /**
     * tests if method offer returns false when object is not added to queue
     */
    @Test
    public void offerTest2(){
        queue.offer(irishWhisky);
        queue.offer(bourbon);
        Assertions.assertFalse(queue.offer(scotch));
    }

    /**
     * tests if method poll returns the right object when object is deleted from queue
     */
    @Test
    public void pollTest(){
        queue.offer(irishWhisky);
        Assertions.assertEquals(irishWhisky, queue.poll());
    }

    /**
     * tests if method poll returns null when queue is empty
     */
    @Test
    public void pollTest2(){
        Assertions.assertNull(queue.poll());
    }

    /**
     * tests if method remove returns the right object when object is deleted from queue
     */
    @Test
    public void removeTest(){
        queue.offer(irishWhisky);
        Assertions.assertEquals(irishWhisky, queue.remove());
    }

    /**
     * tests if method remove throws exception when queue is empty
     */
    @Test
    public void removeTest2(){
        Assertions.assertThrows(NoSuchElementException.class,()-> queue.remove());
    }

    /**
     * tests if method peek returns the first object in queue
     */
    @Test
    public void peekTest(){
        queue.offer(irishWhisky);
        queue.offer(bourbon);
        Assertions.assertEquals(irishWhisky, queue.peek());
    }

    /**
     * tests if method peek returns null when queue is empty
     */
    @Test
    public void peekTest2(){
        Assertions.assertNull(queue.peek());
    }

    /**
     * tests if method element returns the first element in queue
     */
    @Test
    public void elementTest(){
        queue.offer(irishWhisky);
        queue.offer(bourbon);
        Assertions.assertEquals(irishWhisky, queue.element());
    }

    /**
     * tests if method element throws exception if queue is empty
     */
    @Test
    public void elementTest2(){
        Assertions.assertThrows(NoSuchElementException.class,()-> queue.element());
    }
}
