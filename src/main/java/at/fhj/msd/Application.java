package at.fhj.msd;

/**
 * Main class for starting the application
 * @author Emanuel Neziraj & Vinzent Schmid
 */
public class Application {
    /**
     * Main method for creating Objects
     * @param args
     */
    public static void main(String[] args) {
        StringQueue s = new StringQueue(5);
        System.out.println(s.element());
    }
}