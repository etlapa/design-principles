package mx.edev.design_principles.interface_segregation.case2.solution;

public class ScrumMaster implements ScrumMasterActivitites {
  @Override
  public void facilitateScrumEvent() {
    System.out.println(
        "Facilitate Scrum events: Sprint Planning, Daily Standups, Sprint Reviews, and Sprint Retrospectives");
  }

  @Override
  public void removeImpediment() {
    System.out.println("Address conflicts, resolve dependencies, escalate issues");
  }
}
