package java_programming_09;

public class Submarine extends Vehicle
{
	private int depth;
	public Submarine ()
	{
		super ();
		depth = 0;
	}
	public Submarine (int newYears, int newSpeed, String newCompany, int newDepth) // 값이 존재하는 생성자
	{
		super (newYears, newSpeed, newCompany);
		depth = newDepth;
	}
	public void setDepth (int newDepth) // depth 값을 설정하는 설정자
	{
		depth = newDepth;
	}
	public int getDepth () // depth 값을 반환하는 접근자
	{
		return depth;
	}
	public String toString ()
	{
		return "제조 년도는 " + super.getYears() + "년 속력은 시속 " + super.getSpeed() + "km/h 브랜드명은 " + super.getCompany() + " 수심은 " + depth + "m 입니다.";
	}
}
