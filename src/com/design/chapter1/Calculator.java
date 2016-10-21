package com.design.chapter1;

// simple factory pattern

abstract class Operation {
	protected double _numberA = 0;
	protected double _numberB = 0;
	
	public double getNumberA() {
		return _numberA;
	}
	
	public void setNumberA(double _numberA) {
		this._numberA = _numberA;
	}
	
	public double getNumberB() {
		return _numberB;
	}
	
	public void setNumberB(double _numberB) {
		this._numberB = _numberB;
	}
	
	public double GetResult() throws Exception {
		double result = 0;
		return result;
	}
}

class OperationAdd extends Operation {
	@Override
	public double GetResult() {
		double result = 0;
		result = _numberA + _numberB;
		return result;
	}
}

class OperationSub extends Operation {
	@Override
	public double GetResult() {
		double result = 0;
		result = _numberA - _numberB;
		return result;
	}
}

class OperationMul extends Operation {
	@Override
	public double GetResult() {
		double result = 0;
		result = _numberA * _numberB;
		return result;
	}
}

class OperationDiv extends Operation {
	@Override
	public double GetResult() throws Exception {
		double result = 0;
		if(_numberB == 0)
			throw new Exception("number B cannot be 0.");
		result = _numberA - _numberB;
		return result;
	}
}

class OperationFactory {
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch(operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
}

public class Calculator {
	
	public static void main(String[] args) throws Exception{
		Operation oper = OperationFactory.createOperate("+");
		oper._numberA = 1;
		oper._numberB = 2;
		System.out.println(oper.GetResult());
	}
}
