package com.test.design.immutable;

public class Address implements Cloneable {
	private String hno;

	private String city;

	private int pin;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", pin=" + pin + "]";
	}

	
	 @Override
	    public Object clone()
	        throws CloneNotSupportedException
	    {
	        return super.clone();
	    }

}
