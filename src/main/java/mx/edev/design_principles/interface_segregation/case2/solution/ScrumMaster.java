package mx.edev.design_principles.interface_segregation.case2.violation;

public class ScrumMaster implements AgileActivities {
  @Override
  public void refineBacklog() {
    throw new UnsupportedOperationException("Invalid activity for Scrum master");
  }

  @Override
  public void communicateStakeholder() {
    throw new UnsupportedOperationException("Invalid activity for Scrum master");
  }

  @Override
  public void facilitateScrumEvent() {
    System.out.println(
        "Facilitate Scrum events: Sprint Planning, Daily Standups, Sprint Reviews, and Sprint Retrospectives");
  }

  @Override
  public void removeImpediment() {
    System.out.println("Address conflicts, resolve dependencies, escalate issues");
  }

  @Override
  public void implementUserStory() {
    throw new UnsupportedOperationException("Invalid activity for Scrum master");
  }

  @Override
  public void deploySolution() {
    throw new UnsupportedOperationException("Invalid activity for Scrum master");
  }
}
