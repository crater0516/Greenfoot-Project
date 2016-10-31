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
		System.out.println("Car 생성 완료!");
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
		return "현재 기어는 " + gear + "단, 속력은 시속 " + speed + "km/h, 색상은 " + color + " 입니다.";
	}
}
