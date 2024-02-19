package mx.edev.design_principles.liskov_substitution.case3.violation;

public class EmployeeFulltime extends Employee {
  public EmployeeFulltime(String fullname, int hoursWorked, int extraHours) {
    super(fullname, hoursWorked, extraHours, true);
  }
}
