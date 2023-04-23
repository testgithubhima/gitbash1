package Maven;

import org.testng.annotations.Test;

public class RegressionEx {

	@Test(groups = "smoketest")
	public void m2()
	{
		System.out.println("method2 running");
	}
}
