package com.design.chapter2;

public class CashContext_Strategy {
	CashSuper cs = null;
	public CashContext_Strategy(String type) {
		switch(type) {
		case "Normal":
			CashNormal cs0 = new CashNormal();
			cs = cs0;
			break;
		case "Give 300 and return 100":
			CashReturn cr1 = new CashReturn("300","100");
			cs = cr1;
			break;
		case "80%":
			CashRebate cr2 = new CashRebate("0.8");
			cs = cr2;
			break;
		}
	}
	
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}
}
