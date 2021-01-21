import java.util.ArrayList;

/**
 * Golfer, which implements Subject
 * @author Brooks Robinson
 */
public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructor for Golfer object
     * @param name the golfer's name
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Allows observers to be registered for Golfer
     * @param observer A observer of type Observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Allows observers for Golfer to be removed
     * @param observer A observer of type Observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies observers of Golfer of the score that has been entered
     * @param strokes number of strokes taken on a hole
     * @param par par of the hole
     */
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Allows a golfer to be given a score for a hole / round
     * @param strokes number of strokes
     * @param par a hole's par
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes,par);
    }

    /**
     * Prints the name of the Golfer when called
     * @return Golfer's name
     */
    public String getName() {
        return this.name;
    }
}