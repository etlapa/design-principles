package mx.edev.design_principles.liskov_substitution.case3.solution;

public class EmployeeContrator extends Employee {
  private final double HOUR_VALUE = 40;

  public EmployeeContrator(String fullname, int hoursWorked) {
    super(fullname, hoursWorked);
  }

  @Override
  double calculateSalary() {
    return HOUR_VALUE * getHoursWorked();
  }
}
