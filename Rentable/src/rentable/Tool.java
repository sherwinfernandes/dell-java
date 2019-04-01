package rentable;

public class Tool implements Rentable {

	public double hourlyRate;
	private String description;
	
	public Tool(double hourlyRate, String description) {
		super();
		this.hourlyRate = hourlyRate;
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
		return hourlyRate*24;
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return (hourlyRate*24)*days;
	}


}
