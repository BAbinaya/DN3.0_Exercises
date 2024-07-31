package observerPattern;

import java.util.List;

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
    void setPrice(double price);
    double getPrice();
    List<Observer> getObservers();
}

