package org.vaadin.artur.dashboard.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.vaadin.testbench.elements.AbstractTextFieldElement;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TextFieldElement;

public class LoginView extends TestView {

	public LoginView(WebDriver driver) {
		super(driver);
	}

	public DashboardView login() {
		return login("Foo", "Bar");
	}

	public DashboardView login(String username, String password) {
		setUserName(username);
		setPassword(password);
		signIn();
		return new DashboardView(getDriver());
	}

	private void signIn() {
		$(ButtonElement.class).caption("Sign In").first().click();
	}

	private void setUserName(String username) {
		TextFieldElement field = $(TextFieldElement.class).caption("Username")
				.first();
		setValue(field, username);

	}

	private void setValue(AbstractTextFieldElement field, String username) {
		// TFElement.setValue sends enter which will cause a login - can't use
		// that currently
		field.clear();
		field.sendKeys(username);
		field.sendKeys(Keys.TAB);

	}

	private void setPassword(String password) {
		AbstractTextFieldElement field = $(AbstractTextFieldElement.class)
				.caption("Password").first();
		setValue(field, password);
	}

}
