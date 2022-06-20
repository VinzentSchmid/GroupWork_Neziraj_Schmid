package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class for creating a queue of Strings
 */

public class StringQueue implements IQueue {
  /**
   * New Arraylist of Strings
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * Maximum size of List
   */
  private int maxSize; //Fehler 1

  /**
   * Constructor for class StringQueue
   * @param maxSize - for setting the maximal size of List
   */
  public StringQueue(int maxSize) {//Fehler 1
    this.maxSize = maxSize;
  }

  /**
   * Method for adding String to the queue
   * @param obj - for adding to the queue
   * @return true if String is added to queue
   */
  @Override
  public boolean offer(Object obj) {
    if (elements.size() != maxSize)
      elements.add((String) obj);
    else
      return false;

    return true;
  }

  /**
   * Method for deleting first object in queue
   * @return element if queue is not empty, else return null
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() != 0) {//Fehler 2
      elements.remove(0);
    }else {
      element = null;
    }

    return element;
  }

  /**
   * Removes first element, but if there is no element, a NoSuchElementException will be thrown
   * @return element which was removed
   */
  @Override
  public String remove() {
    String element = poll();//Fehler 3
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Get first element of list, but when list is null, null will be returned
   * @return first element of list
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * Get first element of list, but when object is null, a NoSuchElementException will be thrown
   * @return first drink of list
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}