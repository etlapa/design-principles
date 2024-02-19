package mx.edev.design_principles.solid.liskov_substitution.case3.violation;

public class Employee {
  private final String fullname;
  private final int hoursWorked;
  private final int extraHours;
  private final boolean isFulltime;

  public Employee(String fullname, int hoursWorked, int extraHours, boolean isFulltime) {
    this.fullname = fullname;
    this.hoursWorked = hoursWorked;
    this.extraHours = extraHours;
    this.isFulltime = isFulltime;
  }

  public String getFullname() {
    return fullname;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }

  public int getExtraHours() {
    return extraHours;
  }

  public boolean isFulltime() {
    return isFulltime;
  }

  public double calculateSalary() {
    double hourValue = (isFulltime) ? 50 : 40;
    return hourValue * (hoursWorked + extraHours);
  }
}
