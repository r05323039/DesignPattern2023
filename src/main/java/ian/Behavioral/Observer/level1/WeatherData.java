package ian.Behavioral.Observer.level1;

import java.util.ArrayList;
import java.util.List;

class WeatherData {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}