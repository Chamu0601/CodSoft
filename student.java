import java.util.Scanner;
class student {
	public static void main(String args[]){
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter student roll no:");
	int rno=sc.nextInt();
	System.out.print("Enter student name:");
	String name=sc.next();
	System.out.print("Enter how many subject is required :");
	int sno=sc.nextInt();
		for(int i=1;i<=sno;i++){
		   System.out.print("Enter subject mark out of 100:");
			int marks=sc.nextInt();
		sum = sum+marks;
}			
		System.out.println("TOTAL MARKS IS:"+sum);

	float avg=sum/sno;
	System.out.println("YOUR PERCENTAGES IS:"+avg);

	if (avg>=75 && avg<=100)
	{
	    System.out.print("Grade:DISTINCTION");
	}
	else if (avg>=60 && avg<75)
	{
	    System.out.print("Grade:FIRST CLASS");
	}
	else if (avg>=50 &&  avg<60)
	{
	   System.out.print("Grade:SECOND CLASS");
	}
	else if (avg>=35 &&  avg<50)
	{
	   System.out.print("Grade:PASS");
	}
	else{
	    System.out.println("YOU ARE FAIL");
	}
	
	}
}
	
	