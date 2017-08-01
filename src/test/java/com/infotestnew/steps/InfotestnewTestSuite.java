package com.infotestnew.steps;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class InfotestnewTestSuite extends WebDriverTestCase {

	@Test(groups = { "P1", "P2", "SMOKE" }, description = "test")
	public void test() {
		//TODO: call test steps
		
		getDriver().get("https://www.google.com");
		System.out.println("helloooooo");
		
	}

}
