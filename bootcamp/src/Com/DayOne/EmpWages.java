package Com.DayOne;

public class EmpWages {
	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;
	static final int EMP_RATE_PER_HOURS=125;
	static final int NUM_WORKING_DAYS=30;
	static final int MAX_HRS_IN_A_MONTH=100;
	
	public static void main (String[] args) {
		int empHrs=0 , empWage=0 ,totalEmpWage=0, totalEmpHrs=0 ,totalWorkingDays=0 ;
		while (totalEmpHrs<MAX_HRS_IN_A_MONTH || totalWorkingDays<NUM_WORKING_DAYS) {
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random()*10)%3;
			System.out.println("Employee Attendance Check" +empCheck);
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			empWage=empHrs*EMP_RATE_PER_HOURS;
			System.out.println("Employee Wage is"+empWage);
			totalEmpWage=totalEmpWage+empWage;
			
		}
		System.out.println("Total Emp Wage ="+totalEmpWage);
	}
	

}
