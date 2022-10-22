public class VehicleFactory {
	public static Vehicle createVehicle(String type) {
		if (type == "twowheeler") {
			return new TwoWheeler();
		} else if (type == "fourwheeler") {
			return new FourWheeler();
		} else {
			return null;
		}
	}
}
