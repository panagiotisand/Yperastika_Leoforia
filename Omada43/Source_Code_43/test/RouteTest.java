import static org.junit.Assert.*;

import org.junit.Test;


public class RouteTest {

	@Test
	public void testSetAll() {
		Route route = new Route();
		route.setAll(040,1100,100,"Moday",10,"Athina_thesaloniki");
		assertEquals(040, route.getBusName());
		assertEquals(1100 , route.getTime ());
		assertEquals(100 , route.getSeats ());
		assertEquals("Moday" , route.getDay ());
		assertEquals( 10, route.getTicketPrice ());
		assertEquals( "Athina_thesaloniki", route.getRoute ());
		
	}


}
