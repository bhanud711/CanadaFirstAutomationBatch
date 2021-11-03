package com.testng;

import org.testng.annotations.Test;

public class InvTest {

	@Test(invocationCount=3,invocationTimeOut=300000000)
	public void friutMarket()
	{
		System.out.println("Hyderabd fruit market");
	}
}
