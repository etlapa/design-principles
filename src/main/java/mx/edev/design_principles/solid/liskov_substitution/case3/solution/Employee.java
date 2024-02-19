package mx.edev.design_principles.solid.liskov_substitution.case3.solution;

public abstract class Employee {
  private final String fullname;
  private final int hoursWorked;

  public Employee(String fullname, int hoursWorked) {
    this.fullname = fullname;
    this.hoursWorked = hoursWorked;
  }

  public String getFullname() {
    return fullname;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  abstract double calculateSalary();
}
