package com.demo.tests;

import org.testng.annotations.*;

public class Test2 {

    // ========================================== sb kuch same tb Alphabetical  
    // 🔵 SUITE LEVEL (Runs only once per suite)
    // ==========================================
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite → Suite setup started");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite → Suite execution completed");
    }

    // ==========================================
    // 🔵 TEST LEVEL (Runs once for <test> tag)
    // ==========================================
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest → Pre-requisites for test block");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest → Test block completed");
    }

    // ==========================================
    // 🔵 CLASS LEVEL
    // ==========================================
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass → Test2 class started");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass → Test2 class completed");
    }

    // ==========================================
    // 🔵 METHOD LEVEL
    // ==========================================
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod → Starting a test case");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod → Test case completed");
    }

    // =======================================================
    // 🔴 TEST CASES — Total 50 (All TestNG features included)
    // =======================================================

    // -------------------------
    // GROUP: SMOKE TESTS
    // -------------------------

    @Test(groups = "smoke")
    public void test01() { System.out.println("Test01 Smoke"); }

    @Test(groups = "smoke")
    public void test02() { System.out.println("Test02 Smoke"); }

    @Test(groups = "smoke")
    public void test03() { System.out.println("Test03 Smoke"); }

    @Test(groups = "smoke")
    public void test04() { System.out.println("Test04 Smoke"); }

    @Test(groups = "smoke")
    public void test05() { System.out.println("Test05 Smoke"); }


    // -------------------------
    // GROUP: SANITY TESTS
    // -------------------------

    @Test(groups = "sanity")
    public void test06() { System.out.println("Test06 Sanity"); }

    @Test(groups = "sanity")
    public void test07() { System.out.println("Test07 Sanity"); }

    @Test(groups = "sanity")
    public void test08() { System.out.println("Test08 Sanity"); }

    @Test(groups = "sanity")
    public void test09() { System.out.println("Test09 Sanity"); }

    @Test(groups = "sanity")
    public void test10() { System.out.println("Test10 Sanity"); }


    // -------------------------
    // GROUP: REGRESSION TESTS
    // -------------------------

    @Test(groups = "regression")
    public void test11() { System.out.println("Test11 Regression"); }

    @Test(groups = "regression")
    public void test12() { System.out.println("Test12 Regression"); }

    @Test(groups = "regression")
    public void test13() { System.out.println("Test13 Regression"); }

    @Test(groups = "regression")
    public void test14() { System.out.println("Test14 Regression"); }

    @Test(groups = "regression")
    public void test15() { System.out.println("Test15 Regression"); }


    // -------------------------
    // DEPENDS ON METHODS
    // -------------------------

    @Test
    public void login() {
        System.out.println("Login Success");
    }

    @Test(dependsOnMethods = "login")
    public void dashboard() {
        System.out.println("Dashboard Loaded");
    }

    @Test(dependsOnMethods = {"login", "dashboard"})
    public void logout() {
        System.out.println("Logout Success");
    }


    // -------------------------
    // PRIORITY
    // -------------------------

    @Test(priority = 1)
    public void test16() { System.out.println("Priority 1"); }

    @Test(priority = 2)
    public void test17() { System.out.println("Priority 2"); }

    @Test(priority = 0)
    public void test18() { System.out.println("Priority 0"); }


    // -------------------------
    // INVOCATION COUNT
    // -------------------------
    @Test(invocationCount = 3)
    public void testRepeated() {
        System.out.println("Repeated Test");
    }


    // -------------------------
    // ENABLE/DISABLE
    // -------------------------
    @Test(enabled = false)
    public void skippedTest() {
        System.out.println("This test will not run");
    }


    // -------------------------
    // TIMEOUT
    // -------------------------
    @Test(timeOut = 2000)
    public void fastTest() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Fast test within timeout");
    }


    // -------------------------
    // EXPECTED EXCEPTION
    // -------------------------
    @Test(expectedExceptions = ArithmeticException.class)
    public void testException() {
        int x = 1 / 0;
    }


    // -------------------------
    // PARAMETERS
    // -------------------------
    @Test
    @Parameters({"username"})
    public void parameterTest(String username) {
        System.out.println("Username: " + username);
    }


    // -------------------------
    // DATA PROVIDER
    // -------------------------
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"user1", "pwd1"},
            {"user2", "pwd2"},
            {"user3", "pwd3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void dataProviderTest(String user, String pass) {
        System.out.println("Login with " + user + " : " + pass);
    }


    // -------------------------
    // MOBILE TESTS GROUP
    // -------------------------

    @Test(groups = "mobile")
    public void mobile01() { System.out.println("Mobile Test 01"); }

    @Test(groups = "mobile")
    public void mobile02() { System.out.println("Mobile Test 02"); }

    @Test(groups = "mobile")
    public void mobile03() { System.out.println("Mobile Test 03"); }


    // -------------------------
    // API TESTS
    // -------------------------
    @Test(groups = "api")
    public void api01() { System.out.println("API Test 01"); }

    @Test(groups = "api")
    public void api02() { System.out.println("API Test 02"); }

    @Test(groups = "api")
    public void api03() { System.out.println("API Test 03"); }


    // -------------------------
    // WEB TESTS
    // -------------------------
    @Test(groups = "web")
    public void web01() { System.out.println("Web Test 01"); }

    @Test(groups = "web")
    public void web02() { System.out.println("Web Test 02"); }

    @Test(groups = "web")
    public void web03() { System.out.println("Web Test 03"); }

}
