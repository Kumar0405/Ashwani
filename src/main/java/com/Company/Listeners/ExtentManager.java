package com.Company.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentSparkReporter reporter;
    private static ExtentReports reports;

    private  ExtentManager(){
    }
    public static ExtentReports getInstance(){
        if(reports == null){
            reports = createInstance();
        }
        return reports;
    }
    private static ExtentReports createInstance(){
        reporter = new ExtentSparkReporter("./Report.html");
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setReportName("Report");
        reporter.config().setDocumentTitle("Document");

        reports = new ExtentReports();
        reports.attachReporter(reporter);
        return reports;
    }
}
