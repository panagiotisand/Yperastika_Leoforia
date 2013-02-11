import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class LoginTest {

	@Test
	public void testConnectionMethod() {
		Login login = new Login();
		// an o kodikos einai sostos kai o xristis einai diaxiristis prepi na episteci timi "1"
		// an o kodikos einai sostos kai o xristis einai tamias prepi na episteci timi "2"
		// an o kodikos einai lathos prepi na episteci timi "0"
		
		assertEquals("Result", 1, login.connectionMethod("panagiotis","andriotis"));
		assertEquals("Result", 1, login.connectionMethod("cse38094","openlab"));
		assertEquals("Result", 1, login.connectionMethod("cse36866","openlab"));
		assertEquals("Result", 1, login.connectionMethod("cse30754","openlab"));
		assertEquals("Result", 1, login.connectionMethod("cse38094","openlab"));
		
		assertEquals("Result", 2, login.connectionMethod("prezerakos","openlab"));	
		assertEquals("Result", 2, login.connectionMethod("mixalis","openlab"));
		assertEquals("Result", 0, login.connectionMethod("Error","Password"));	 
		assertEquals("Result", 2, login.connectionMethod("bagelis","openlab"));
		assertEquals("Result", 2, login.connectionMethod("dimitris","openlab"));
		
	}
	
	
	

//	@Test
	public void testLogin() {
		Login login = new Login();
		//usernameTextField.setText("blah"); 
		
	}

	
}
