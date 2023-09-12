package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class DemoTest3 extends BaseTest
{

	@Test
	public void testB()
	{
		Reporter.log(driver.getTitle(),true);
		Assert.fail();
	}
}
