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
	public int getYears () // years ������ ��ȯ�ϴ� �������̴�.
	{
		return years;
	}
	public void setYears (int newYear) // years ������ �����ϴ� �������̴�.
	{
		years = newYear;
	}
	public int getSpeed () // speed ������ ��ȯ�ϴ� �������̴�.
	{
		return speed;
	}
	public void speedUp (int increment) // speed ������ ������ ���ڸ�ŭ �÷��ش�.
	{
		speed += increment;
	}
	public void speedDown (int decrement) // speed ������ ������ ���ڸ�ŭ �����ش�.
	{
		speed -= decrement;
	}
	public String getCompany () // company ������ ��ȯ���ִ� �������̴�.
	{
		return company;
	}
	public void setCompany (String newCompany) // company ������ �������ִ� �������̴�.
	{
		company = newCompany;
	}
	public String toString () // ��������� �������ش�.
	{
		return "���� �⵵�� " + years + "�� �ӷ��� �ü� " + speed + "km/h �귣����� " + company + " �Դϴ�.";
	}
}
