package org.bank;

import org.sample.AxisBank;
//Method Overriding
public class CityBank extends AxisBank
{
@Override
public void savings() {
	// TODO Auto-generated method stub
	System.out.println("Savings rate is 2%");
	super.savings();
}
@Override
	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("Deposit rate is 1%");
		super.deposit();
	}
public static void main(String[] args) {
	CityBank c = new CityBank();
	c.savings();
	c.deposit();
}

}
