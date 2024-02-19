package mx.edev.design_principles.interface_segregation.case2.violation;

public class Manager implements AgileActivities {
    @Override
    public void work() {
        System.out.println("Manager is managing.");
    }

    @Override
    public void manage() {
        System.out.println("Manager is also managing.");
    }
}