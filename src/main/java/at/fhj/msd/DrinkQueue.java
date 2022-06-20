package at.fhj.msd;

import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue{
    @Override
    public boolean offer(Object obj) {
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Drink remove() {
        Drink drinks = poll();
        if (drinks == null)
            throw new NoSuchElementException("there's no element any more");

        return drinks;
    }

    @Override
    public Drink peek() {
        Drink element;
        if (drinks.size() > 0)
            element = drinks.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public Drink element() {
        Drink element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
