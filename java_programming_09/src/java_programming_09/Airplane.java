package java_programming_09;

public class Airplane extends Vehicle
{
	private int height;
	public Airplane ()
	{
		super(); // Vehicle field �ʱ�ȭ
		height = 0; // Airplane field �ʱ�ȭ
	}
	public Airplane (int newYears, int newSpeed, String newCompany, int newHeight) // ���� �����ϴ� ������
	{
		super (newYears, newSpeed, newCompany);
		height = newHeight;
	}
	public void setHeight (int newHeight) // height ���� �����ϴ� ������
	{
		height = newHeight;
	}
	public int getHeight () // height ���� ��ȯ�ϴ� ������
	{
		return height;
	}
	public String toString ()
	{
		return "���� �⵵�� " + super.getYears() + "�� �ӷ��� �ü� " + super.getSpeed() + "km/h �귣����� " + super.getCompany() + " ����  " + height + "ft �Դϴ�.";
	}
}
