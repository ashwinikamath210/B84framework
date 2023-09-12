package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest1;

public class DemoTest2 extends BaseTest1
{

	@Test
	public void testB()
	{
		Reporter.log(driver.getTitle(),true);
		
	}
}