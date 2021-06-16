public class EmpWageSwitch
{
		public static void main(String args[])
		{
			final int isFullTime=1;
			final int isPartTime=2;
			int empRatePerHr=20;
			int empHrs=0;
			int empWage=0;
			int value=(int)Math.floor(Math.random()*10)%3;
			
			switch(value)
			{	
				case isFullTime:
					empHrs=8;
					System.out.println("Emp is present for fulltime");
					break;
				case isPartTime:
					empHrs=4;
					System.out.println("Emp is Present for parttime");
					break;
				default:
					empHrs=0;
					System.out.println("Emp is absent");
			}
			empWage=empHrs*empRatePerHr;
			System.out.println("Emp Daily Wage:" +empWage);
		}
	
}
