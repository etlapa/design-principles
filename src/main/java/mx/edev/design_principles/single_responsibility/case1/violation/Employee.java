package mx.edev.design_principles.single_responsibility.case1.violation;

public class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void saveEmployeeToFile() {
    // Code to save employee data to a file
    System.out.println("Saving employee data to file: " + name + ", " + salary);
  }

  public void calculateSalaryIncrement() {
    // Code to calculate salary increment
    System.out.println("Calculating salary increment for employee: " + name);
    // Logic for calculating salary increment
  }
}
