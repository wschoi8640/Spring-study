package domain;

import battery.ChargeBattery;
import battery.NormalBattery;
import toy.ToyCar;
import toy.ToyRadio;
import toy.ToyRobot;

public class MainClass {

	public static void main(String[] args) {
		// Injection ��� 1 : �����ڿ��� ��������
		ToyCar toyCar = new ToyCar();

		// Injection ��� 2: �����ڿ��� ��������
		ToyRadio toyRadio = new ToyRadio(new ChargeBattery());
		
		// Injection ��� 3 : getter and setter
		ToyRobot toyRobot = new ToyRobot();
		toyRobot.setBattery(new NormalBattery());
	}

}
