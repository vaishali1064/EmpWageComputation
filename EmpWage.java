public class EmpWage 
{
		public static final int IS_FULLTIME=1;
		public static final int IS_PARTTIME=2;
	   
		

				public static int computeWage(String company, int empRatePerHrs, int noOfWorkingDays, int maxHrsPerMonth)
				{
					int empHrs=0, total_Emp_Hrs=0, totalWorkingDays=0;
					  while(total_Emp_Hrs<=maxHrsPerMonth && totalWorkingDays<=noOfWorkingDays)
				      {
				         totalWorkingDays++;
				         double empCheck= Math.floor(Math.random()*10)%3;
				         System.out.println("Random Number " +empCheck);
			
				         switch ((int)empCheck)
				         {
				            case IS_FULLTIME:
				               System.out.println("Fulltime");
				               empHrs=8;
				               break;
				            case IS_PARTTIME:
				               System.out.println("Parttime");
				               empHrs=4;
				               break;
				            default:
				               System.out.println("Employee is Absent");
				               empHrs=0;
				         }
				         total_Emp_Hrs += empHrs;
				         System.out.println("totalWorkingDays " +totalWorkingDays);
				         System.out.println("total_Emp_Hrs " +total_Emp_Hrs);
				      }
					 int total_Emp_Wage=total_Emp_Hrs*empRatePerHrs;
					  System.out.println("total_Emp_Wage for company " +company +" is " +total_Emp_Wage);
					  
					return total_Emp_Wage;
				}
					 public static void main(String[] args)
					 {
						 	computeWage("Dmart", 20, 20, 100);
						 	computeWage("Pantaloon", 10, 20, 150);
						
					 }
}
