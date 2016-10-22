package com.design.chapter2;

/* strategy pattern
 * firstly review the simple factory pattern
 */


class CashNormal implements CashSuper {

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money;
	}
}

class CashRebate implements CashSuper {

	private double moneyRebate = 1.0;
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*moneyRebate;
	}
}

class CashReturn implements CashSuper {
	
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result = money;
		if(money >= moneyCondition)
			result = money - Math.floor(money/moneyCondition)*moneyReturn;
			
		return result;
	}
	
}

class CashFactory {
	
}

public class Casher_factory {

}
