package rentable;

public class Condo implements Rentable {

	public double weeklyRate;
	private String description;
	
	public Condo(double weeklyRate, String description) {
		super();
		this.weeklyRate = weeklyRate;
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
		return weeklyRate/7;
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return (weeklyRate/7)*days;
	}



}
