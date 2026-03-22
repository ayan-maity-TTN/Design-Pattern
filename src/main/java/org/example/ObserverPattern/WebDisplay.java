package org.example.ObserverPattern;

public class WebDisplay implements Observer{

  @Override
  public void update(float temperature) {
    System.out.println("Web Display: Current temperature is " + temperature + "°C");
  }
}
