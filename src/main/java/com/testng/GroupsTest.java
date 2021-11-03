package com.testng;

import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups= {"regression","Sanity"})
	public void one()
	{
	System.out.println("hello i am one");	
	}
	
    @Test(groups= {"sanity"})
	public void two()
	{
	System.out.println("hello i am two");	
	}
	
    @Test(groups= {"regression"})
	public void three()
	{
		System.out.println("Hello i am three");
	}
}
