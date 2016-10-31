package java_programming_09;

public class Submarine extends Vehicle
{
	private int depth;
	public Submarine ()
	{
		super ();
		depth = 0;
	}
	public Submarine (int newYears, int newSpeed, String newCompany, int newDepth) // ���� �����ϴ� ������
	{
		super (newYears, newSpeed, newCompany);
		depth = newDepth;
	}
	public void setDepth (int newDepth) // depth ���� �����ϴ� ������
	{
		depth = newDepth;
	}
	public int getDepth () // depth ���� ��ȯ�ϴ� ������
	{
		return depth;
	}
	public String toString ()
	{
		return "���� �⵵�� " + super.getYears() + "�� �ӷ��� �ü� " + super.getSpeed() + "km/h �귣����� " + super.getCompany() + " ������ " + depth + "m �Դϴ�.";
	}
}
