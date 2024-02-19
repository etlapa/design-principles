package mx.edev.design_principles.interface_segregation.case2.violation;

public class ProductOwner implements AgileActivities {

  @Override
  public void refineBacklog() {
    System.out.println("Prioritize and refine items in backlog");
  }

  @Override
  public void communicateStakeholder() {
    System.out.println(
        "Gather requirements, provide feedback, align product and stakeholder expectations");
  }

  @Override
  public void facilitateScrumEvent() {
    throw new UnsupportedOperationException("Invalid activity for Product Owner");
  }

  @Override
  public void removeImpediment() {
    throw new UnsupportedOperationException("Invalid activity for Product Owner");
  }

  @Override
  public void implementUserStory() {
    throw new UnsupportedOperationException("Invalid activity for Product Owner");
  }

  @Override
  public void deploySolution() {
    throw new UnsupportedOperationException("Invalid activity for Product Owner");
  }
}
