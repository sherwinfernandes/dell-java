package driverslicense;

import java.time.*;

public class LicenseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriversLicense person1=  new DriversLicense.Builder().first("Bob")
															.last("Jones")
															.dob(LocalDate.of(1990, 01, 01))
															.height(185)
															.gender("male")
															.build();
		
		DriversLicense person2=  new DriversLicense.Builder().first("Richard")
															.last("Nixon")
															.dob(LocalDate.of(1970, 02, 14))
															.height(180)
															.gender("male")
															.build();
		
		DriversLicense person3=  new DriversLicense.Builder().first("Jedi")
															.last("Knight")
															.dob(LocalDate.of(1890, 12, 12))
															.height(200)
															.gender("female")
															.build();
		
		System.out.println(person1.getFullName() + " is "+person1.getAge()+" years old");
		System.out.println(person2.getFullName() + " is "+person2.getAge()+" years old");
		System.out.println(person3.getFullName() + " is "+person3.getAge()+" years old");

	}

}
