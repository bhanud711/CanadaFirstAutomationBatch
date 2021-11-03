package com.testng;

import org.testng.annotations.Test;

public class AttributesTest {

	@Test(priority=3)
	public void mango()
	{
		System.out.println("Hello i am mango");
	}
	@Test(priority=4)
	public void banana()
	{
		System.out.println("Hello i am banana");
	}
	@Test(priority=1)
	public void grapes()
	{
		System.out.println("hello i am grapes");
	}
	@Test(priority=2)
	public void sapota()
	{
		System.out.println("hello ai am sapota");
	}
}
