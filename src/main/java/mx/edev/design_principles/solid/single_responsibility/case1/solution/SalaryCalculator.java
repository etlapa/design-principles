package mx.edev.design_principles.solid.single_responsibility.case1.solution;

/** Class responsible for calculating salary increments */
public class SalaryCalculator {
  /**
   * Logic for calculating salary increment
   *
   * @param salary
   * @return
   */
  public double calculateIncrement(double salary) {
    System.out.println("Calculating salary increment for employee");
    return salary * 0.1; // Example logic for calculating increment
  }
}
