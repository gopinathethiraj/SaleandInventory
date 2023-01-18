package Practice_Maven;

import org.testng.annotations.Test;

public class SimpleTest2 {
	
		@Test(groups = "regression")
		public void simple3() {
			System.out.println("Test Script-3");
		}
		@Test(groups = "smoke")
		public void simple4() {
			System.out.println("Test Script-4");
		}
	}


