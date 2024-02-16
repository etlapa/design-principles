package mx.edev.design_principles.single_responsibility.case1.solution;

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

  // Separate class responsible for saving employee data to a file
  public void saveEmployeeToFile(FileSaver fileSaver) {
    fileSaver.saveToFile(name, salary);
  }

  // Separate class responsible for calculating salary increment
  public double calculateSalaryIncrement(SalaryCalculator calculator) {
    return calculator.calculateIncrement(salary);
  }
}
