package Insurance;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {

	protected String insuranceName;
	protected double price;
	protected Date startDate;
	protected Date finishDate;

	public Insurance(String insuranceName, double price, Date startDate, Date finishDate) {

		this.insuranceName = insuranceName;
		this.price = price;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}
	
	public String getinsuranceName() {
		return insuranceName ;
	}
	public void setinsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	public Double getPrice() {
		
		return price ;
	}
	public void setPrice(Double price) {
		this.price =price;
	}
	public Date getstartDate() {
		return startDate ;
	}
	public void setstartDate(Date startDate ) {
		this.startDate = startDate;
	}
	public Date getfinishDate() {
		return finishDate ;
	}
	public void setfinishDate(Date finishDate ) {
		this.finishDate =finishDate;
	}
	protected abstract double calculate();
	

	public abstract String toString();
	
}
