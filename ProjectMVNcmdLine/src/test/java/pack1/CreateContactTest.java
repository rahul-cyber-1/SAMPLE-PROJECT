package pack1;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void createContact() {
		
	    String URL=System.getProperty("url","loclahost:8888/");
	    String BROWSER=System.getProperty("browser","chrome");
	    String USERNAME=System.getProperty("username","admin");
	    String PASSWORD=System.getProperty("password","admin");
		System.out.println("contact is created");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void modifyContact() {
		System.out.println(" contact modifed");
	}
	@Test
	public void deleteContact() {
		System.out.println(" contact deleted");
	}
	@Test
	public void addContactwithorg() {
		System.out.println(" contact addedwith org");
	}

}
