public class Demo {
	public static void main(String[] args) {
		Vehicle v1 = VehicleFactory.createVehicle("twowheeler");
		v1.getWheelType();
		Vehicle v2 = VehicleFactory.createVehicle("fourwheeler");
		v2.getWheelType();
	}
}
