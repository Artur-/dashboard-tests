package org.vaadin.artur.dashboard.pages;

import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.elements.LabelElement;

public class SalesView extends MenuView {

	public SalesView(WebDriver driver) {
		super(driver);
	}

	public String getHeader() {
		return getContent().$(LabelElement.class).first().getText();
	}

	public static SalesView loginAndOpen(WebDriver driver) {
		return new LoginView(driver).login().openSales();
	}

}
