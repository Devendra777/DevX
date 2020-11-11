package org.jecm7.factoryApp;

public class TubeLightImpl implements ISwitch
{

	@Override
	public void sOn()
	{
		System.out.println("TubeLight turned On!!!");
		
	}

	@Override
	public void sOff()
	{
		System.out.println("TubeLight turned Off!!!");
		
	}
	
}
