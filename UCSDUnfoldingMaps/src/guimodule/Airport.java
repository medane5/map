package guimodule;

public class Airport {

	private String name;
	private String country;
	private String code;
	
	public Airport(String name, String country, String code) {
		
		this.name=name;
		this.country=country;
		this.code=code;
	}
	
	
	String getName() {return this.name;}
	String getCountry() {return this.country;}
	String getCode() {return this.code;}
	
	public void setName(String name) {this.name=name;}
	public void setCountry(String country) {this.country=country;}
	public void setCode(String code) {this.code=code;}
	
}
