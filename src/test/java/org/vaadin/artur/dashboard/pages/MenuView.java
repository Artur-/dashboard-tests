package org.vaadin.artur.dashboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.AbstractComponentElement;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.CustomComponentElement;

public class MenuView extends TestView {

	public MenuView(WebDriver driver) {
		super(driver);
	}

	public SalesView openSales() {
		getMenu().$(ButtonElement.class).caption("Sales").first().click();
		return new SalesView(getDriver());
	}

	public AbstractComponentElement getMenu() {
		return ((TestBenchElement) getDriver().findElement(
				By.className("valo-menu")))
				.wrap(AbstractComponentElement.class);
	}
	public AbstractComponentElement getContent() {
		return ((TestBenchElement) getDriver().findElement(
				By.className("view-content")))
				.wrap(AbstractComponentElement.class);
	}
}
