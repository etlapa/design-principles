package mx.edev.design_principles.interface_segregation.case2.solution;

public class Main {
  public static void main(String[] args) {
    ProductOwner productOwner = new ProductOwner();
    System.out.println("********* " + productOwner.getClass().getSimpleName() + " *********");
    productOwner.refineBacklog();
    productOwner.communicateStakeholder();

    ScrumMaster scrumMaster = new ScrumMaster();
    System.out.println("********* " + scrumMaster.getClass().getSimpleName() + " *********");
    scrumMaster.facilitateScrumEvent();
    scrumMaster.removeImpediment();

    Developer developer = new Developer();
    System.out.println("********* " + developer.getClass().getSimpleName() + " *********");
    developer.implementUserStory();
    developer.deploySolution();
  }
}
