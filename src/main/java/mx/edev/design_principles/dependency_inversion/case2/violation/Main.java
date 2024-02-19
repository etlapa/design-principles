package mx.edev.design_principles.dependency_inversion.case2.violation;

public class Main {
  public static void main(String[] args) {
    App app = new App();
    app.logToFile("First log");
    app.logToDatabase("Second log");
  }
}
