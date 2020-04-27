package adress;

public class HomeAdres implements adres {

	private String city;
	private String AdresDetail;
	private String zipCode;
	
	public HomeAdres (String city, String AdresDetail,String zipCode) {
		this.city=city;
		this.AdresDetail=AdresDetail;
		this.zipCode=zipCode;
		
	}
	//Overloading
	public HomeAdres() {
		
	}
	
	public String getCity() {
		 return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getAdresDetail() {
		 
		return AdresDetail;
	}
	public void setAdresDetail(String AdresDetail ) {
		
		this.AdresDetail=AdresDetail;
	}
	
	public String getzipCode() {
		 
		return zipCode;
	}
	public void setzipCode(String zipCode ) {
		
		this.zipCode=zipCode;
	}
	

	@Override
	public void showAdres() { this.toString();}

	@Override
	public String toString() {
		
		return "HomeAdress [City=" + city + ", AdresDetail=" + AdresDetail + ", zipCode="+ zipCode + "]";
		
	}
	}
