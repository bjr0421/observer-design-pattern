/**
 * Interface which provides the methods necessary to satisfy observers' requirements
 * @author Brooks Robinson
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
