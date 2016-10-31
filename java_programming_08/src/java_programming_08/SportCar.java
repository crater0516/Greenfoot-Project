package java_programming_08;

public class SportCar extends Car
{
	int turbo = 5;
	
	public SportCar()
	{
		System.out.println("SportCar 생성 완료!");
	}
	public void TuroboUp()
	{
		speed += turbo;
	}
}
