package java_programming_08;

public class Car
{
	public int gear;
	public int speed;
	public String color;
	public Car()
	{
		gear = 0;
		speed = 0;
		color = "default";
		System.out.println("Car ���� �Ϸ�!");
	}
	public Car(int nowGear, int nowSpeed, String nowColor)
	{
		gear = nowGear;
		speed = nowSpeed;
		color = nowColor;
	}
	public void setGear(int newGear)
	{
		gear = newGear;
	}
	public void speedUp (int increment)
	{
		speed += increment;
	}
	public void speedDown (int decrement)
	{
		speed -= decrement;
	}
	public void setColor (String newColor)
	{
		color = newColor;
	}
	public String toString ()
	{
		return "���� ���� " + gear + "��, �ӷ��� �ü� " + speed + "km/h, ������ " + color + " �Դϴ�.";
	}
}
