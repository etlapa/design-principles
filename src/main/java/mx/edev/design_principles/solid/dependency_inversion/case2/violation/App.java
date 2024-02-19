package mx.edev.design_principles.solid.dependency_inversion.case2.violation;

/** High-level module */
class App {
  private FileLogger fileLogger = new FileLogger();
  private DatabaseLogger databaseLogger = new DatabaseLogger();

  public void logToFile(String message) {
    fileLogger.log(message);
  }

  public void logToDatabase(String message) {
    databaseLogger.log(message);
  }
}
