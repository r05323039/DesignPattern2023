package ian.Behavioral.Observer.level1;

class TemperatureObserver implements Observer {
    private float temperature;
    private WeatherData weatherData;

    public TemperatureObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        // ref觀察對象，同時觀察對象ref觀察者
    }

    public void update(float temperature, float humidity) {// 實作想觀察的屬性即可
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("溫度觀察 : " + temperature);
    }
}
