package com.demo.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    // This is the method included in XML
    @Test
    @Parameters({"URL", "APIKey_username"})
    public void sampleTest(String url, String apiKey) {
        System.out.println("Running sampleTest from Test1");
        System.out.println("URL = " + url);
        System.out.println("API Key = " + apiKey);
    }

    // Just another test for demonstration (not included in XML)
    @Test
    public void sampleTest2() {
        System.out.println("Running sampleTest2 from Test1");
    }
}
