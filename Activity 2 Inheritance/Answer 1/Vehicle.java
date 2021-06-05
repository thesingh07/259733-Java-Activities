
class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displayMake() {
		System.out.println("***" + make +"***");
	}
	
	public void displayBasicInfo() {
		System.out.println("---Basic Information---");
        System.out.println("\nVehicle Number: " + vehicleNumber + "\nFuel Type: " + fuelType
                + "\nFuel Capacity: " + fuelCapacity + "\nCC: " + cc);
	}
	
	public void displayDetailInfo() {
		
	}	 	
}