package com.TTD_JUNIT_Task;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JUNIT_Testing {
	JUNIT_Demo obj=new JUNIT_Demo();
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals(obj.To_Remove_A("ABCD"),"BCD");
		assertEquals(obj.To_Remove_A("AACD"),"CD");
		assertEquals(obj.To_Remove_A("BACD"),"BCD");
		assertEquals(obj.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(obj.To_Remove_A("AABAA"),"BAA");
	}
}
