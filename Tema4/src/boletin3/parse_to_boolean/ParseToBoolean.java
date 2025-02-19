package boletin3.parse_to_boolean;

public class ParseToBoolean {
	public boolean parseToBoolean(int num) {
		boolean buleano = false;
		if(num == 1) {
			buleano = true;
		}
		return buleano;
	}
	public boolean parseToBoolean(String num) {
		boolean buleano = false;
		if(num.equals("true")) {
			buleano = true;
		}
		return buleano;
	}
	
}
