package rentable;

public interface Rentable {
	public String getDescription();// returns the description of the item.
	public double getDailyRate();// returns the daily rate for renting the item
	public double getPrice(double days);// returns the amount due for renting the item for the a given number of days.
}
