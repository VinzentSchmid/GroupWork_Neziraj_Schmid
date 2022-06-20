package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class for creating a queue of drinks
 * @author Emanuel Neziraj & Vinzent Schmid
 */
public class DrinkQueue implements IQueue{
    /**
     * New Arraylist of objects Drink
     */
    private List<Drink> drinks = new ArrayList<Drink>();

    /**
     * Maximum size of List
     */
    private int maxSize;

    /**
     * Constructor for class DrinkQueue
     * @author Emanuel Neziraj
     * @param maxSize - for setting the maximal size of List
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Method for adding Drink object to the queue
     * @author Emanuel Neziraj
     * @param obj - for adding to the queue
     * @return true if Drink is added to queue
     */
    @Override
    public boolean offer(Object obj) {
        if (drinks.size() != maxSize)
            drinks.add((Drink) obj);
        else
            return false;

        return true;
    }

    /**
     * Method for deleting first object in queue
     * @author Emanuel Neziraj
     * @return object if queue is not empty, else return null
     */
    @Override
    public Drink poll() {
        Drink element = (Drink) peek();

        if (drinks.size() != 0) {//Fehler 2
            drinks.remove(0);
        }else {
            element = null;
        }

        return element;
    }

    /**
     * @author Vinzent Schmid
     * Removes first drink, but if there is no drink. It will throw a NoSuchElementException
     * @return drink which was removed
    */
    @Override
    public Drink remove() {
        Drink drinks = poll();
        if (drinks == null)
            throw new NoSuchElementException("there's no element any more");

        return drinks;
    }
    /**
     * @author Vinzent Schmid
     * Get first drink of list, but when list is null, it will return null
     * @return first drink of list
     */
    @Override
    public Drink peek() {
        Drink drink;
        if (drinks.size() > 0)
            drink = drinks.get(0);
        else
            drink = null;

        return drink;
    }
    /**
     * @author Vinzent Schmid
     * Get first element of drink list but when object is null it will throw NoSuchElementException
     * @return first drink of list
     */
    @Override
    public Drink element() {
        Drink element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
