package operator;

public class CalAdd implements Calculator{
	
	@Override
	public int work(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

}