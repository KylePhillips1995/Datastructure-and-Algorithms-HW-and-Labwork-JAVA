
public class Address implements Cloneable{
	String streetAddress;
	String city;
	public Address()
	{
		streetAddress="10 Main St";
		city="Freehold";
	}
	public Address(String s, String c)
	{
		streetAddress=s;
		city=c;
	}
	public void setCity(String c)
	{
		city=c;
	}
	public String toString()
	{
		String result="Street: "+streetAddress;
		result+="\nCity: " + city;
		return result;
	}
	public Address clone()
	{
		//return new Address (streetAddress, this.city.clone());
		return null;
}}
