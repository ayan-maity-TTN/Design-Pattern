package org.example.FactoryDesignPattern;

public class EmployeeFactory {
  public  static Employee getEmployee(String type) {
    if (type.trim().equalsIgnoreCase("android")) {
      return new AndroidDeveloper();
    } else if (type.trim().equalsIgnoreCase("web")) {
      return new WebDeveloper();
    }
    throw new IllegalArgumentException("Unknown employee type: " + type);
  }
}
