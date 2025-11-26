package com.demo.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("➡ Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✔ Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ Test Failed: " + result.getName());
        System.out.println("Reason: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⚠ Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("⚠ Test Failed but within success percentage: " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("⏳ Test Failed with Timeout: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("🚀 Test Execution Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("🏁 Test Execution Finished: " + context.getName());
    }
}

