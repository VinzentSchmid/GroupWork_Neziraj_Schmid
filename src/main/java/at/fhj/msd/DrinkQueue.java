package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class DrinkQueue implements IQueue{
    private List<Drink> drinks = new ArrayList<Drink>();
    private int maxSize;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(Object obj) {
        if (drinks.size() != maxSize)
            drinks.add((Drink) obj);
        else
            return false;

        return true;
    }

    @Override
    public Drink poll() {
        Drink element = peek();

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
