package java_programming_09;

public class Test
{
	public static void main (String[] args)
	{
		Vehicle vc = new Vehicle(1990, 50, "Benz");
		System.out.println(vc);
		
		Car car = new Car(1990, 50, "Benz", 5);
		System.out.println(car);
		car.setBoost(10); // 가속도를 10으로 설정
		car.speedUp(20); // 속도를 20만큼 증가
		System.out.println(car);
		
		Airplane airplane = new Airplane(1987, 500, "Asiana", 3000);
		System.out.println(airplane);
		airplane.speedDown(40); // 속도를 40만큼 감소
		airplane.setHeight(2000); // 높이를 2000으로 설정
		System.out.println(airplane);
		
		Submarine submarine = new Submarine (2015, 20, "Jangbogo", 200);
		System.out.println(submarine);
		submarine.setCompany("Jeanair"); // 브랜드명을 Jeanair 으로 설정
		submarine.setDepth(500); // 수심을 500으로 설정
		System.out.println(submarine);
	}
}
