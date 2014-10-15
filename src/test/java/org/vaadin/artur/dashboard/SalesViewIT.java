package org.vaadin.artur.dashboard;

import org.junit.Assert;
import org.junit.Test;
import org.vaadin.artur.dashboard.pages.SalesView;

/**
 * This class contains JUnit tests, which are run using Vaadin TestBench 4.
 * 
 * To run this, first get an evaluation license from
 * https://vaadin.com/addon/vaadin-testbench and follow the instructions at
 * https://vaadin.com/directory/help/installing-cval-license to install it.
 *
 */
public class SalesViewIT extends AbstractTest {

	@Test
	public void salesViewOpen() throws Exception {
		SalesView sales = SalesView.loginAndOpen(getDriver());
		Assert.assertEquals("Revenue by Movie", sales.getHeader());
	}

}