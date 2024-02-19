package mx.edev.design_principles.solid.liskov_substitution.case3.solution;

public class Main {
  public static void main(String[] args) {
    EmployeeFulltime employeeFulltime = new EmployeeFulltime("John Doe", 160, 10);
    EmployeeContrator employeeContrator = new EmployeeContrator("Jane Doe", 180);
    System.out.println("Employee fulltime salary: " + employeeFulltime.calculateSalary());
    System.out.println("Employee contractor salary: " + employeeContrator.calculateSalary());
    System.out.println("********* Liskov validation *********");
    Employee newEmployeeFulltime = new EmployeeFulltime("John Doe", 160, 10);
    Employee newEmployeeContrator = new EmployeeContrator("Jane Doe", 180);
    System.out.println("Employee fulltime salary: " + newEmployeeFulltime.calculateSalary());
    System.out.println("Employee contractor salary: " + newEmployeeContrator.calculateSalary());
  }
}
