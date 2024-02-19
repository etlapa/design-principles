package mx.edev.design_principles.solid.single_responsibility.case2.solution;

public class Main {
  public static void main(String[] args) {
    ReportGenerator reportGenerator = new ReportGenerator();
    ReportSaver reportSaver = new ReportSaver();
    ReportSender reportSender = new ReportSender();

    String reportData = "Sample report data...";

    // Generating report
    String report = reportGenerator.generateReport(reportData);

    // Saving report to file
    reportSaver.saveReportToFile(report);

    // Sending report by email
    reportSender.sendReportByEmail(report);
  }
}
