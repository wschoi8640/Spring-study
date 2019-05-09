package toy;

import battery.Battery;

public class ToyRadio {
	
	private Battery battery;
	
	public ToyRadio(Battery battery) {
		this.battery = battery;
	}
	
	public ToyRadio() {
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}