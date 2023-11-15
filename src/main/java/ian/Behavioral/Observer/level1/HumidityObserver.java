package ian.Behavioral.Observer.level1;

class HumidityObserver implements Observer {
    private float humidity;
    private WeatherData weatherData;

    public HumidityObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        // ref觀察對象，同時觀察對象ref觀察者
    }

    public void update(float temperature, float humidity) {
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("濕度觀察 : " + humidity);
    }
}
