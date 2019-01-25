package parkinggarage;

public class Car {
	private String _color;//Color
	private String _lic; //License #
	private String _make;//Make
	private String _model; //Model
	
	public Car(String _color, String _lic, String _make, String _model) { //constructor
		this._color = _color;
		this._lic=_lic;
		this._make=_make;
		this._model=_model;
	}
	
	public String print() { //returns a String of car details
		return _color+" "+_lic+" "+_make+" "+_model;
	}
}
