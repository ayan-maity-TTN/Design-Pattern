package org.example.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WebDisplay webDisplay = new WebDisplay();
        MobileDisplay mobileDisplay = new MobileDisplay();

        weatherStation.registerObserver(webDisplay);
        weatherStation.registerObserver(mobileDisplay);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(webDisplay);
        weatherStation.setTemperature(28.0f);
    }
}
