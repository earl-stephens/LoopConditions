package test;
import org.junit.Assert;
import org.junit.Test;

import application.App;

public class AppTest {
	@Test
	public void shouldReturnAnInstanceOfApp() {
		App app = new App();
		Assert.assertNotNull(app);
	}
	
	@Test
	public void shouldReturnFiveStrings() {
		App app = new App();
		int counter = 5;
		String result = app.printHello(counter);
		Assert.assertEquals("HelloHelloHelloHelloHello", result);
	}
}
