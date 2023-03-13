package org.student;

public class Automation extends MultipleLanguages{
	
	public void java()
	{
		System.out.println("java");
	}
	public void Selenium()
	{
		System.out.println("Selenium");
		
	}
	public void ruby()
	{
		System.out.println("ruby");
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.ruby();
		obj.java();
		obj.Selenium();
		
}
}

