package mx.edev.design_principles.solid.liskov_substitution.case3.solution;

public class EmployeeFulltime extends Employee {
  private final double HOUR_VALUE = 50;
  private final int extraHours;

  public EmployeeFulltime(String fullname, int hoursWorked, int extraHours) {
    super(fullname, hoursWorked);
    this.extraHours = extraHours;
  }

  @Override
  double calculateSalary() {
    return HOUR_VALUE * (getHoursWorked() + extraHours);
  }
}
