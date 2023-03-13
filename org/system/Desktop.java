package org.system;

public class Desktop extends Computer{
	public void desktopsize()
	{
		System.out.println("Desktop");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopsize();
	}

}
