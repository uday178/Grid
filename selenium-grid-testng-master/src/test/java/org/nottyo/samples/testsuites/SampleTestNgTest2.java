package org.nottyo.samples.testsuites;

import org.nottyo.samples.TestNgTestBase;
import org.nottyo.samples.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 */
public class SampleTestNgTest2 extends TestNgTestBase {

    @Test
    public void testOpenGoogle() {
        driver.get("https://www.google.co.th");
        Assert.assertNotNull(driver.getTitle());
    }

    @Test
    public void testOpenMedium() {
        driver.get("https://www.medium.com");
        Assert.assertNotNull(driver.getTitle());
    }

}
