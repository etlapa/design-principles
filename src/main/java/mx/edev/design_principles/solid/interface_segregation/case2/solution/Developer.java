package mx.edev.design_principles.solid.interface_segregation.case2.solution;

public class Developer implements DeveloperActivities {
  @Override
  public void implementUserStory() {
    System.out.println("Implement solution for user story");
  }

  @Override
  public void deploySolution() {
    System.out.println("Deploy solution");
  }
}
