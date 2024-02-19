package mx.edev.design_principles.single_responsibility.case2.violation;

public class Main {
  public static void main(String[] args) {
    ReportGenerator reportGenerator = new ReportGenerator();
    String reportData = "Sample report data...";

    // Generating report
    reportGenerator.generateReport(reportData);

    // Saving report to file
    reportGenerator.saveReportToFile(reportData);

    // Sending report by email
    reportGenerator.sendReportByEmail(reportData);
  }
}
