package Insurance;

import java.util.Date;

public class HealthInsurance extends Insurance{

	public HealthInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
		super(insuranceName, price,startDate,finishDate);
	}
	
	@Override
	protected double calculate() {

		return price + price * 0.1;

		
	}

	@Override
	public String toString() {

		return null;
	}
}

