import java.util.ArrayList;

public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(int strokes, int par) {
        for (Observer observer : observers) {
            //observer.update(strokes, par);    TODO remove comment after implementing update functionality
        }
    }

    public void enterScore(int strokes, int par) {
        //TODO add functionality
    }

    public String getName() {
        return this.name;
    }
}