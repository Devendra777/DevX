package org.jecm7.factoryApp;

public class LightFactory
{
	public static ISwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("LedLight"))
		{
			return new LedLightImpl();
		}	
		else if(type.equalsIgnoreCase("TubeLight"))
		{
			return new TubeLightImpl();
		}
		else
		{
			System.out.println("No light Found");
		}
		return null;
	}
}
