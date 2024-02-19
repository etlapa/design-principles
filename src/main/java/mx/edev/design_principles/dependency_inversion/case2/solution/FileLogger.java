package mx.edev.design_principles.dependency_inversion.case2.solution;

// Low-level module
class FileLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println("[FileLogger]: " + message);
  }
}
