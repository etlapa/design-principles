package mx.edev.design_principles.interface_segregation.case1.violation;

public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is coding.");
    }

    @Override
    public void manage() {
        throw new UnsupportedOperationException("Developer cannot manage.");
    }
}