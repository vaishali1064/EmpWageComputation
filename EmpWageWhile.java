public class EmpWageWhile
{
		public static void main(String args[])
		{
			final int isFullTime=1;
			final int isPartTime=2;
			int empRatePerHr=20;
			int NumOfWorkingDays=20;
			int MaxHoursInMonth=100;
			int empHrs=0;
			int TotalEmpHrs=0;
			int TotalWorkingDays=0;
			
			while(TotalEmpHrs<MaxHoursInMonth && TotalWorkingDays<NumOfWorkingDays)
			{
				TotalWorkingDays++;
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
				TotalEmpHrs += empHrs;
				System.out.println("Working Days: " +TotalWorkingDays + " Emp Hours:" +TotalEmpHrs);
			}
			int TotalEmpWage = TotalEmpHrs * empRatePerHr;
			System.out.println("total emp wage:" +TotalEmpWage);
		}
	
}
