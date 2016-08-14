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
			
			Assert.assertEquals("Vikram", validate.getVal());
			
		
		  
		 
  }
  @Test(priority=1)
  public void testFunc1() throws AssertionError {
	  
	  validate.setVal("Vikram");
		
		  Assert.assertEquals("Vikram", validate.getVal());
		  

  }
  @Test(priority=2)
  public void testFunc2() throws AssertionError {
	  
	  validate.setVal("Vikram");
		
		  Assert.assertTrue(validate.getVal().equals("kamaljeet"));
		  

  }
}
