package Chapter17;

import org.testng.annotations.Test;

public class PS1 extends PS{
  @Test
  public void childF() {
	  
	  PS2 ps2 = new PS2(3);
	  //int a = 3;
	  parentF();
	  System.out.println(ps2.increment());
	  System.out.println(ps2.decrement());
	  System.out.println(ps2.multiplyTwo());
  }
}
