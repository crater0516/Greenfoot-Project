package java_programming_08;

public class SportCar extends Car
{
	int turbo = 5;
	
	public SportCar()
	{
		System.out.println("SportCar ���� �Ϸ�!");
	}
	public void TuroboUp()
	{
		speed += turbo;
	}
}
