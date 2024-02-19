package mx.edev.design_principles.solid.interface_segregation.case2.solution;

public class ProductOwner implements ProductOwnerActivities {
  @Override
  public void refineBacklog() {
    System.out.println("Prioritize and refine items in backlog");
  }

  @Override
  public void communicateStakeholder() {
    System.out.println(
        "Gather requirements, provide feedback, align product and stakeholder expectations");
  }
}
