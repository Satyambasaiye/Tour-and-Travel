package pojos;

import javax.persistence.Column;

//
//user_id, name, email,phone,pass

public class Customer extends User{
	
	private String address;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String country="India";
	public Customer() {
		
	}
	
	public Customer(String address, String city, String country) {
		super();
		this.address = address;
		this.city = city;
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return super.toString()+"Customer [address=" + address + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
