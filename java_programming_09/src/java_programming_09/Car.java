package java_programming_09;

public class Car extends Vehicle
{
	private int boost;
	public Car ()
	{
		super(); // Vehicle field �ʱ�ȭ
		boost = 0; // Car field �ʱ�ȭ
	}
	public Car (int newYears, int newSpeed, String newCompany, int newBoost) // ���� �����ϴ� ������
	{
		super (newYears, newSpeed, newCompany);
		boost = newBoost;
	}
	public void setBoost (int newBoost) // boost ���� �����ϴ� ������
	{
		boost = newBoost;
	}
	public int getBoost () // boost ���� ��ȯ�ϴ� ������
	{
		return boost;
	}
	public String toString ()
	{
		return "���� �⵵�� " + super.getYears() + "�� �ӷ��� �ü� " + super.getSpeed() + "km/h �귣����� " + super.getCompany() + " ���ӵ���  " + boost + "m/s2 �Դϴ�.";
		// private ������ �����ڷ� �����;� �Ѵ�.
	}
}
