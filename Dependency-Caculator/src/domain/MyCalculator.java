package domain;


import operator.Calculator;

public class MyCalculator {

	public int firstNum, secondNum;
	public Calculator calculator;
	
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}
	
	public void result() {
		int value = calculator.work(this.firstNum, this.secondNum);
		System.out.println("result : " + value);
	}
}
