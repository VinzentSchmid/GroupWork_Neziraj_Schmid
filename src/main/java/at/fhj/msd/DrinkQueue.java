package at.fhj.msd;

import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{

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
