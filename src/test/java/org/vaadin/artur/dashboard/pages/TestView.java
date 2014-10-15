package org.vaadin.artur.dashboard.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.AbstractHasTestBenchCommandExecutor;
import com.vaadin.testbench.HasTestBenchCommandExecutor;
import com.vaadin.testbench.commands.TestBenchCommandExecutor;

public class TestView extends AbstractHasTestBenchCommandExecutor {

	private WebDriver driver;

	public TestView(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	@Override
	public TestBenchCommandExecutor getTestBenchCommandExecutor() {
        return ((HasTestBenchCommandExecutor) driver)
                .getTestBenchCommandExecutor();
	}

	@Override
	public SearchContext getContext() {
		return getDriver();
	}
}
