public class EmpWage
{
	public static void main( String arg[] )
	{
		int isFullTime=1;
		double value=Math.floor(Math.random()*10)%2;
			
		if(value == isFullTime)
		{
			System.out.println("Emp is Present");
		}
		else
		{
			System.out.println("Emp is Absent");
		}
	}
}
