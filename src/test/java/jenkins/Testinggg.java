package jenkins;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Testinggg {
	@Test
	public void aisehi() {
		System.out.println("kuch bhi");
		
	}

	@Test(groups = "pre-tests")
	public void init() {
		System.out.println("init resources");
		
	}

	@Test(dependsOnGroups = "pre-tests")
	public void insert() {
		System.out.println("inserting demo data");
		
	}

	@Test(dependsOnMethods = "insert", groups = "tests")
	public void select() {
		System.out.println("selecting demo data");
 		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "select", groups = "tests")
	public void update() {
		System.out.println("updating demo data");
	}

	@Test(dependsOnMethods = { "insert", "update" }, groups = "tests")
	public void delete() {
		System.out.println("deleting demo data");
	}

	@Test(dependsOnGroups = "tests")
	public void cleanup() {
		System.out.println("closing resources");
	}
	
}
