package mx.edev.design_principles.solid.dependency_inversion.case2.solution;

public class Main {
  public static void main(String[] args) {
    Logger fileLogger = new FileLogger();
    Logger dbLogger = new DatabaseLogger();
    App app = new App(fileLogger);
    app.log("First log");
    app.setLogger(dbLogger);
    app.log("Second log");
  }
}
