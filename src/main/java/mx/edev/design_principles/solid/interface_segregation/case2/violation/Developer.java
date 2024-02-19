package mx.edev.design_principles.solid.interface_segregation.case2.violation;

public class Developer implements AgileActivities {

  @Override
  public void refineBacklog() {
    throw new UnsupportedOperationException("Invalid activity for Developer");
  }

  @Override
  public void communicateStakeholder() {
    throw new UnsupportedOperationException("Invalid activity for Developer");
  }

  @Override
  public void facilitateScrumEvent() {
    throw new UnsupportedOperationException("Invalid activity for Developer");
  }

  @Override
  public void removeImpediment() {
    throw new UnsupportedOperationException("Invalid activity for Developer");
  }

  @Override
  public void implementUserStory() {
    System.out.println("Implement solution for user story");
  }

  @Override
  public void deploySolution() {
    System.out.println("Deploy solution");
  }
}
