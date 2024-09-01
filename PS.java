package Chapter17;

import org.testng.annotations.*;

public class PS {
	
  @BeforeTest
  public void parentF1() {
	  System.out.println("I should run first!");
  }
  
  @Test
  public void parentF() {
	  System.out.println("This is from parent class");
  }
  
  @AfterTest
  public void parentF2() {
	  System.out.println("I should run last!");
  }
}
