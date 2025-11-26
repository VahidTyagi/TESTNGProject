package com.demo.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

    @Test
    @Parameters({"URL"})
    public void WebHomeLoan(String url) {
        System.out.println("Running WebHomeLoan Test");
        System.out.println("Home Loan URL = " + url);
        System.out.println("Push to code");
    }

    @Test
    public void MobileHomeLoan() {
        System.out.println("Running MobileHomeLoan Test");
    }

    @Test
    public void APILoginHomeLoan() {
        System.out.println("Running API Login for Home Loan");
    }
}
