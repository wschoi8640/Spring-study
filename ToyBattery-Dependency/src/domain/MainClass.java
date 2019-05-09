package domain;

import battery.ChargeBattery;
import battery.NormalBattery;
import toy.ToyCar;
import toy.ToyRadio;
import toy.ToyRobot;

public class MainClass {

	public static void main(String[] args) {
		// 加己 汲沥 规过 1 : 积己磊俊辑 沥利栏肺
		ToyCar toyCar = new ToyCar();

		// 加己 汲沥 规过 2: 积己磊俊辑 悼利栏肺
		ToyRadio toyRadio = new ToyRadio(new ChargeBattery());
		
		// 加己 汲沥 规过 3 : getter and setter
		ToyRobot toyRobot = new ToyRobot();
		toyRobot.setBattery(new NormalBattery());
	}

}
