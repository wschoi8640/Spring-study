package operator;

public class CalDiv implements Calculator {

	@Override
	public int work(int firstNum, int secondNum) {
		return secondNum != 0 ? (firstNum / secondNum) : 0;
	}

}