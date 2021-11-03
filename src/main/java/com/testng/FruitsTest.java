package com.testng;

import org.testng.annotations.Test;

public class FruitsTest {
    @Test(dependsOnMethods="banana")
	public void manago()
	{
		System.out.println("hello i am Mango");
	}
	@Test(dependsOnMethods="pomo")
	public void grapes()
	{
		System.out.println("hello i am grapes");
	}
	@Test(dependsOnMethods="grapes")
	public void banana()
	{
	System.out.println("Hello i am banana");	
	}
	@Test
	public void pomo()
	{
		System.out.println("Hello i am prmo");
	}
}
