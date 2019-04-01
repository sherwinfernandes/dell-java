package driverslicense;

import java.time.*;

public class DriversLicense {

	private final String _first;//First Name
	private final String _last; //Last Name
	private final LocalDate _dob; //DOB
	private final int _height; //Height
	private final String _gender; //Gender
	
	
	public String getFullName() { // Returns the fuill name
		return _first+" "+_last;
	}
	
	public int getAge() { // Retuens the age
		return Period.between(_dob, LocalDate.now()).getYears();
	}
	
	private DriversLicense(String _first,String _last, LocalDate _dob,int _height,String _gender){
		this._first=_first;
		this._last=_last;
		this._dob = _dob;
		this._height=_height;
		this._gender=_gender;
	}
	
	public static class Builder{ // Builder design pattern
		private String _first;//First Name
		private String _last; //Last Name
		private LocalDate _dob; //DOB
		private int _height; //Height
		private String _gender; //Gender
		
		public DriversLicense build() { //Builds a DriversLicense
			return new DriversLicense(_first,_last, _dob,_height,_gender);
		}
		
		public Builder first(String _first) { //first name
			this._first=_first;
			return this;
		}
		
		public Builder last(String _last) { //last name
			this._last=_last;
			return this;
		}

		
		public Builder dob(LocalDate _dob) { // dob
			this._dob=_dob;
			return this;
		}

		
		public Builder height(int _height) { //height
			this._height=_height;
			return this;
		}

		
		public Builder gender(String _gender) {// gender
			this._gender=_gender;
			return this;
		}

		
	}
	

}
