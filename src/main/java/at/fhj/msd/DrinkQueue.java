package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
}
