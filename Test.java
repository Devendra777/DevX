package org.jecm7.factoryApp;
import java.util.*;
public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter type of light??");
		String type=sc.next();
		sc.close();
		ISwitch sw=LightFactory.getLight(type);
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}
		
	}
}
