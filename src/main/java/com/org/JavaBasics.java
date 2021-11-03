package com.org;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<Integer>();
System.out.println(al.size());
al.add(10);
al.add(20);
System.out.println(al);
al.add(30);
al.add(40);
System.out.println(al);
Iterator<Integer> i = al.iterator();
while(i.hasNext())
{
	int p=i.next();
	System.out.println(p);
	
}
	}

}
