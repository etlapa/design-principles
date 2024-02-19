package mx.edev.design_principles.dependency_inversion.case2.violation;

/** Low-level module */
class DatabaseLogger {
  public void log(String message) {
    System.out.println("[DatabaseLogger]: " + message);
  }
}
