package com.testng;

import org.testng.annotations.Test;

public class SkipTest {
	@Test(alwaysRun=true)
	public void manago()
	{
		System.out.println("hello i am Mango");
	}
	@Test(enabled=false)
	public void grapes()
	{
		System.out.println("hello i am grapes");
	}
	@Test(enabled=false)
	public void banana()
	{
	System.out.println("Hello i am banana");	
	}
	@Test(alwaysRun=true)
	public void pomo()
	{
		System.out.println("Hello i am prmo");
	}
}
