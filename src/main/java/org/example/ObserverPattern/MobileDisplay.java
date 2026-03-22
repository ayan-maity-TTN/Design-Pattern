package org.example.ObserverPattern;

public class MobileDisplay implements Observer{

  @Override
  public void update(float temperature) {
    System.out.println("Mobile Display: Current temperature is " + temperature + "°C");
  }
}
