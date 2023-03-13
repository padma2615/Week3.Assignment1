package org.bank;

public class Axisbank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposit minimum 2000");
	}
public static void main(String[] args) {
	Axisbank obj=new Axisbank();
	obj.savings();
	obj.fixed();
	obj.deposit();
}
}
