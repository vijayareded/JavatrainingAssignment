package package2;

public class GradesAvg {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int numStudents;
		int marks;
		System.out.print("number of student:"+ " ");
		numStudents= sc.nextInt();
		double average=0.0;
		double total=0.0;
		
		int grades[]=new int[numStudents];
		
		int counter=0;
		while(counter<numStudents) {
			System.out.print("Enter the grade for student "+ (counter+1) + ":" +" ");
			marks=sc.nextInt();
			if(marks>100 || marks<0 ) {
				System.out.println("Invalid grade, please enter valid grade");
				continue;
			}
			grades[counter++]= marks;
		}
		
		for(int grade: grades) {
			total+=grade;
		}
		
		average=total/grades.length;
		
		System.out.println("average: "+ average);
		
	}
}


