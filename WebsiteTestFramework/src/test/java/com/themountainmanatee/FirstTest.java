package com.themountainmanatee;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {
	
	@Before
	public void openWebsite() {
		//Browser.createDriver();
		Pages.homePage().goTo();
	}
	
	
	@Test
	public void isOnHomePage() {
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@After
	public void cleanUp() {
		Browser.close();
	}
	

}
