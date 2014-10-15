package org.vaadin.artur.dashboard;

import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import com.vaadin.testbench.TestBenchTestCase;

public class AbstractTest extends TestBenchTestCase {
	@Rule
	public ScreenshotOnFailureRule screenshotOnFailureRule = new ScreenshotOnFailureRule(
			this, true);

	@Before
	public void setUp() throws Exception {
		setDriver(new FirefoxDriver());

		getDriver().get("http://dashboard.demo.vaadin.com/");
	}

}
