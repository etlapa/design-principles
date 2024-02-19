package mx.edev.design_principles.solid.interface_segregation.case2.violation;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<AgileActivities> roles =
        Arrays.asList(new ProductOwner(), new ScrumMaster(), new Developer());
    roles.forEach(
        role -> {
          System.out.println("********* " + role.getClass().getSimpleName() + " *********");
          try {
            role.refineBacklog();
          } catch (Exception e) {
            System.out.println("-- refineBacklog exception for : " + e.getMessage());
          }
          try {
            role.communicateStakeholder();
          } catch (Exception e) {
            System.out.println("-- communicateStakeholder exception for : " + e.getMessage());
          }
          try {
            role.facilitateScrumEvent();
          } catch (Exception e) {
            System.out.println("-- facilitateScrumEvent exception for : " + e.getMessage());
          }
          try {
            role.removeImpediment();
          } catch (Exception e) {
            System.out.println("-- removeImpediment exception for : " + e.getMessage());
          }
          try {
            role.implementUserStory();
          } catch (Exception e) {
            System.out.println("-- implementUserStory exception for : " + e.getMessage());
          }
          try {
            role.deploySolution();
          } catch (Exception e) {
            System.out.println("-- deploySolution exception for : " + e.getMessage());
          }
        });
  }
}
