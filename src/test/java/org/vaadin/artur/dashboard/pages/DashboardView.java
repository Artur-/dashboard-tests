package org.vaadin.artur.dashboard.pages;

import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.elements.ButtonElement;

public class DashboardView extends MenuView {

	public DashboardView(WebDriver driver) {
		super(driver);
	}

	public static DashboardView loginAndOpen(WebDriver driver) {
		return new LoginView(driver).login();
	}
}
