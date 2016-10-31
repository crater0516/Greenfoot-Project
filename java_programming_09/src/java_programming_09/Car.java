package java_programming_09;

public class Car extends Vehicle
{
	private int boost;
	public Car ()
	{
		super(); // Vehicle field 초기화
		boost = 0; // Car field 초기화
	}
	public Car (int newYears, int newSpeed, String newCompany, int newBoost) // 값이 존재하는 생성자
	{
		super (newYears, newSpeed, newCompany);
		boost = newBoost;
	}
	public void setBoost (int newBoost) // boost 값을 설정하는 설정자
	{
		boost = newBoost;
	}
	public int getBoost () // boost 값을 반환하는 접근자
	{
		return boost;
	}
	public String toString ()
	{
		return "제조 년도는 " + super.getYears() + "년 속력은 시속 " + super.getSpeed() + "km/h 브랜드명은 " + super.getCompany() + " 가속도는  " + boost + "m/s2 입니다.";
		// private 변수는 접근자로 가져와야 한다.
	}
}
