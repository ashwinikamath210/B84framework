package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest1;

public class DemoTest1 extends BaseTest1
{

	@Test
	public void testA()
	{
		Reporter.log(driver.getTitle(),true);
	}
}
