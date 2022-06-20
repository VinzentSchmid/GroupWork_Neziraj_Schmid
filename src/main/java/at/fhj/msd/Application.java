package at.fhj.msd;

/**
 * Main class for starting the application
 * @author Emanuel Neziraj
 * @authos Vinzent Schmid
 */
public class Application {
    /**
     * Main method for creating Objects
     * @param args arguments from cli
     */
    public static void main(String[] args) {
        StringQueue s = new StringQueue(5);
        System.out.println(s.element());
    }
}