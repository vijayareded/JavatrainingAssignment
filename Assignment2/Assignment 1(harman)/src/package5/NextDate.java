package package5;
import java.util.Scanner;

public class NextDate {
public static void main(String[] args) {
		
		int day, month, year;
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter day");
			day = sc.nextInt();

			System.out.println("Enter month");
			month = sc.nextInt();

			System.out.println("Enter year");
			year = sc.nextInt();
		}

		System.out.println("current date: " + day + "/" + month + "/" + year);

		
		int noOfDaysInMonth[]={-1, 31,28,31,30,31,30,31,31,30,31,30,31};

		  if(isLeapYear(year)){
			noOfDaysInMonth[2]=29;
		  }
		  
	  
		  day=day+1; 
		  

		  if(day > noOfDaysInMonth[month]){
			day=1;
			month++;
			if(month > 12){
				month=1;
				year++;
			}
		  }  
		  System.out.println("next date: " + day + "/" + month + "/" + year);  
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;
	}
}




