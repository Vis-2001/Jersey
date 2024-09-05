package spring.api0;

public class Hall {
	private int id;
	private String name, contactNumber;
	private double costPerDay;
	String ownerName;

	public Hall() {
		super();
	}

	public Hall(int id, String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String toString() {
		return "<hall><contactNumber>"+this.contactNumber+"</contactNumber><costPerDay>"+this.costPerDay+"</costPerDay><id>"+this.id+"</id><name>"+this.name+"</name><ownerName>"+this.ownerName+"</ownerName></hall>";
	}
}
