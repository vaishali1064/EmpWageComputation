public class EmpDailyWage
{
		public static void main(String args[])
		{
			int isFullTime=1;
			int empRatePerHr=20;
			int empHrs=0;
			int empWage=0;
			double value=Math.floor(Math.random()*10)%2;
			
			if(value == isFullTime)
			{	empHrs=8;
				System.out.println("Emp is present");
			}
			else
			{
				empHrs=0;
				System.out.println("Emp is absent");
			}
			empWage=empHrs*empRatePerHr;
			System.out.println("Emp Daily Wage:" +empWage);
		}
	
}
