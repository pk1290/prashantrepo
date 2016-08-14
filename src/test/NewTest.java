package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
private StringValidation validate;
  @BeforeTest
  public void beforeTest(){
	  
	  validate = new StringValidation();  
  }
  @Test
  public void testFunc() throws AssertionError {
	  
	  validate.setVal("Rustom");
		try {
			
			Assert.assertEquals("Vikram", validate.getVal());
			
		} catch (AssertionError e) {
			
			System.out.println(e.getMessage());
		}
		  
		 
  }
  @Test(priority=1)
  public void testFunc1() throws AssertionError {
	  
	  validate.setVal("Vikram");
		
		  Assert.assertEquals("Vikram", validate.getVal());
		  
		  throw new AssertionError();
  }
}
