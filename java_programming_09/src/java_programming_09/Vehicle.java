package java_programming_09;

public class Vehicle
{
	private int years;
	private int speed;
	private String company;
	
	public Vehicle ()
	{
		years = 0;
		speed = 0;
		company = "default";
	}
	public Vehicle (int newYear, int newSpeed, String newCompany)
	{
		years = newYear;
		speed = newSpeed;
		company = newCompany;
	}
	public int getYears () // years 변수를 반환하는 접근자이다.
	{
		return years;
	}
	public void setYears (int newYear) // years 변수를 설정하는 설정자이다.
	{
		years = newYear;
	}
	public int getSpeed () // speed 변수를 반환하는 접근자이다.
	{
		return speed;
	}
	public void speedUp (int increment) // speed 변수를 일정한 숫자만큼 올려준다.
	{
		speed += increment;
	}
	public void speedDown (int decrement) // speed 변수를 일정한 숫자만큼 내려준다.
	{
		speed -= decrement;
	}
	public String getCompany () // company 변수를 반환해주는 접근자이다.
	{
		return company;
	}
	public void setCompany (String newCompany) // company 변수를 설정해주는 설정자이다.
	{
		company = newCompany;
	}
	public String toString () // 출력형식을 지정해준다.
	{
		return "제조 년도는 " + years + "년 속력은 시속 " + speed + "km/h 브랜드명은 " + company + " 입니다.";
	}
}
