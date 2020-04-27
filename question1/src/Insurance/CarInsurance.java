package Insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

	public CarInsurance(String insuranceName, double price, Date startDate, Date finishDate) {
		super(insuranceName, price,startDate,finishDate);
	}
	
	@Override
	protected double calculate() {

		return price + price * 0.5;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
