package com.Company.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ProjectListeners implements ITestListener {
    ExtentReports reports = ExtentManager.getInstance();
    ExtentTest test;

    public void onFinish(ITestContext context) {
        reports.flush();
    }
    public void onTestStart(ITestResult result) {
        test= reports.createTest(result.getInstanceName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("pass , " + result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
        test.fail("fail , " + result.getMethod().getMethodName()+" -> "+
                result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {
        test.skip("skip , " + result.getMethod().getMethodName()+" -> "+
                result.getThrowable().getMessage());
    }



}
