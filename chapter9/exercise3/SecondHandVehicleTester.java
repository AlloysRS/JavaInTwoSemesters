package exercise3;

public class SecondHandVehicleTester {

	public static void main(String[] args) {
		SecondHandVehicle banger = new SecondHandVehicle("NZ12 ZHD", "Vauxhall", 2012, 1400.00, 5);
		
		banger.setValue(1350.00);
		
		System.out.println("Car Details:");
		System.out.println("Reg No: " + banger.getRegNo());
		System.out.println("Car Make: " + banger.getMake());
		System.out.println("Car Manufactured: " + banger.getYearofManufacture());
		System.out.println("Car Age: " + banger.calculateAge(2024) + " years old");
		System.out.println("Car Value: £" + banger.getValue());

	}

}
