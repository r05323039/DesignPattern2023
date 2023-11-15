package ian.Behavioral.Observer.level1;

class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemperatureObserver t = new TemperatureObserver(weatherData);
        HumidityObserver h = new HumidityObserver(weatherData);

        weatherData.setMeasurements(29, 65);
        System.out.println();
        weatherData.setMeasurements(42, 72);
    }
}
