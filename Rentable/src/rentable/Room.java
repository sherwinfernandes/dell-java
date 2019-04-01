package rentable;

public class Room implements Rentable {

	private double dailyRate;
	private String description;
	
	public Room(double dailyRate, String description) {
		super();
		this.dailyRate = dailyRate;
		this.description = description;
	}

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a "+ super.getClass() +" "+description;
	}

	@Override
	public double getDailyRate() {
		// TODO Auto-generated method stub
		return dailyRate;
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return dailyRate*days;
	}


}
