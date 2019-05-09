package battery;

public class NormalBattery implements Battery {
	@Override
	public String getBatteryValue() {
		return "Unchargable";
	}
}
