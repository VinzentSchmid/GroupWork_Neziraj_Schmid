package at.fhj.msd;

/**
 * Interface for implementing a queue
 */
public interface IQueue {
  /**
   * Method for adding object to the queue
   * @param obj - for adding to the queue
   * @return true if object is added to queue
   */
  public abstract boolean offer(Object obj);

  /**
   * Method for deleting first object in queue
   * @return element if queue is not empty, else return null
   */
  public abstract Object poll();

  /**
   * Removes first element, but if there is no element, a NoSuchElementException will be thrown
   * @return element which was removed
   */
  public abstract Object remove();

  /**
   * Get first element of list, but when list is null, null will be returned
   * @return first element of list
   */
  public abstract Object peek();

  /**
   * Get first element of list, but when object is null, a NoSuchElementException will be thrown
   * @return first drink of list
   */
  public abstract Object element();
}