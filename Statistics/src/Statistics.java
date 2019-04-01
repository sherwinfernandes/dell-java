import java.util.Scanner;

public class Statistics {

	private static Scanner inp = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a list of comma separated numbers");
		String text=inp.nextLine();
		String [] parts= text.split(",");
		double[] nums= new double[parts.length];
		for (int i=0; i<parts.length;i++) {
			nums[i]=Double.parseDouble(parts[i]);
		}
		
		System.out.println("min is "+ min(nums));
		System.out.println("max is "+ max(nums));
		System.out.println("count is "+ count(nums));
		System.out.println("mean is "+ mean(nums));
		System.out.println("sum is "+ sum(nums));
		inp.close();
	}
	
	private static double min(double [] nums) {
		double currmin= nums[0];
		for (int i=0;i<nums.length;i++) {
			if (nums[i]< currmin) currmin=nums[i];
		}
		return currmin;
	}
	
	private static double max(double [] nums) {
		double currmax= nums[0];
		for (int i=0;i<nums.length;i++) {
			if (nums[i]> currmax) currmax=nums[i];
		}
		return currmax;
	}

	private static double count(double [] nums) {
		return nums.length;
	}
	
	private static double mean(double [] nums) {
		return sum(nums)/count(nums);
	}
	
	private static double sum(double [] nums) {
		double tally=0;
		for (int i=0;i<nums.length;i++) {
			tally +=nums[i];
		}
		return tally;
	}
}
