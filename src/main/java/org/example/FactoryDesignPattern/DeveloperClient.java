package org.example.FactoryDesignPattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DeveloperClient {

  public static void main(String[] args) {
//        Employee employee = new AndroidDeveloper();  // tightly coupled

    Employee employee = EmployeeFactory.getEmployee("android"); // loosely coupled
    System.out.println("Salary: " + employee.salary());
    }
  }