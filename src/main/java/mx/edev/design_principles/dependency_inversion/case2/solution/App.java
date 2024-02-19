package mx.edev.design_principles.dependency_inversion.case2.solution;

// High-level module
class App {
  private Logger logger;

  public App(Logger logger) {
    this.logger = logger;
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }

  public void log(String message) {
    logger.log(message);
  }
}
