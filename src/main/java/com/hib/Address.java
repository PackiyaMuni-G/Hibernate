package com.hib;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	 private String street;
	    private String city;
	    private int pincode;
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int i) {
			this.pincode = i;
		}
}
