package mx.edev.design_principles.solid.dependency_inversion.case2.violation;

/** Low-level module */
class FileLogger {
  public void log(String message) {
    System.out.println("[FileLogger]: " + message);
  }
}
