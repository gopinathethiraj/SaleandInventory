package Practice_Maven;

import org.testng.annotations.Test;

public class SimpleTest1 {
	@Test(groups = "smoke")
	public void simple1() {
		System.out.println("Test Script-1");
	}
	@Test(groups = "regression")
	public void simple2() {
		System.out.println("Test Script-2");
	}
}
	


