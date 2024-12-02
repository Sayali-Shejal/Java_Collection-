package org.techhub;
import java.util.*;
import java.util.function.*;
public class  Ascending
{
	public static void main(String []arg)
	{
		Vector v=new Vector();
		v.add(1);
		v.add(10);
		v.add(13);
		v.add(91);
		v.add(11);
		v.add(21);
		
		System.out.println("Before Sorting");
		for(Object obj:v)
		{
			System.out.println(obj+"\t");
		}
		for(int i=0;i<v.size();i++)
		{
			for(int j=(i+1);j<v.size();j++)
			{
				Object prev=v.get(i);
				Object next=v.get(j);
				if((int)prev>(int)next)
				{
					v.set(i,next);
					v.set(i,prev);
				}
			}
		}
		
		System.out.println("After  Sorting");
		for(Object obj:v)
		{
			System.out.println(obj+"\t");
		}
		
	}
}