import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class AnnouncementTest {

	@Test
	public void testsetAnnText(){  
		Announcement ann = new Announcement();
		ann.setAnnText("xxx");
		assertEquals("xxx", ann.getAnnText());
		
	}
	
}
