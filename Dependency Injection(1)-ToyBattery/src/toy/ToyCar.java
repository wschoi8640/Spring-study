package toy;

import battery.Battery;
import battery.NormalBattery;

public class ToyCar {
	
	private Battery battery;
	
	public ToyCar() {
		battery = new NormalBattery();
	}
	
}