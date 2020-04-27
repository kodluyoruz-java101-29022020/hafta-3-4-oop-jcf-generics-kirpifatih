package adress;

public class BusinesAdres implements adres {

	private String CompanyName;
	private String city;
	private String AdresDetail;
	private String zipCode;
	
	public BusinesAdres (String CompanyName,String city, String AdresDetail,String zipCode) {
		this.CompanyName=CompanyName;
		this.city=city;
		this.AdresDetail=AdresDetail;
		this.zipCode=zipCode;
		
	}
	//Overloading
	public BusinesAdres (String city, String AdresDetail,String zipCode) {
		
		this.city=city;
		this.AdresDetail=AdresDetail;
		this.zipCode=zipCode;
		
	}
   public BusinesAdres() {
		
	}
	public String getCompanyName() {
		 return city;
	}
	public void setCompanyName(String CompanyName) {
		
		this.CompanyName=CompanyName;
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
	
	public String getzip() {
		 
		return zipCode;
	}
	public void setzipCode(String zipCode ) {
		
		this.zipCode=zipCode;
	}
	

	@Override
	public void showAdres() { this.toString();}

	@Override
	public String toString() {
		
		return "BusinesAdres [CompanyName=" + CompanyName +",City=" + city + ", AdresDetail=" + AdresDetail + ", zipCode="+ zipCode + "]";
		
	}
}
