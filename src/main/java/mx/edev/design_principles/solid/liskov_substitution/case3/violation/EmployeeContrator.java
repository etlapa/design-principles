package mx.edev.design_principles.solid.liskov_substitution.case3.violation;

public class EmployeeContrator extends Employee {
  public EmployeeContrator(String fullname, int hoursWorked) {
    super(fullname, hoursWorked, 0, false);
  }
}
