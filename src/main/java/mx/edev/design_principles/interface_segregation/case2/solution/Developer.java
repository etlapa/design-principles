package mx.edev.design_principles.interface_segregation.case1.solution;

public class Developer implements Workerable {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }
}
