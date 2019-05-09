package domain;

import battery.ChargeBattery;
import battery.NormalBattery;
import toy.ToyCar;
import toy.ToyRadio;
import toy.ToyRobot;

public class MainClass {

	public static void main(String[] args) {
		// �Ӽ� ���� ��� 1 : �����ڿ��� ��������
		ToyCar toyCar = new ToyCar();

		// �Ӽ� ���� ��� 2: �����ڿ��� ��������
		ToyRadio toyRadio = new ToyRadio(new ChargeBattery());
		
		// �Ӽ� ���� ��� 3 : getter and setter
		ToyRobot toyRobot = new ToyRobot();
		toyRobot.setBattery(new NormalBattery());
	}

}
