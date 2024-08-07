import java.util.*;
class Student_Grade
{
	int marks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark for 5 subjects:");
		System.out.println("Enter marks for English: ");
		int m1= sc.nextInt();
		System.out.println("Enter marks for Language ");
		int m2= sc.nextInt();
		System.out.println("Enter marks for Maths: ");
		int m3= sc.nextInt();
		System.out.println("Enter marks for Science: ");
		int m4= sc.nextInt();
		System.out.println("Enter marks for Social Science: ");
		int m5= sc.nextInt();
		
		if((m1>=35)&(m2>=35)&(m3>=35)&(m4>=35)&(m5>=35)){
			
			int total=(m1+m2+m3+m4+m5);
			return total;
		}
		else
		{
			int total=(m1+m2+m3+m4+m5);
			System.out.println("Failed ");	
			return 0;
		}
	}
	
	float percentage(float total)
	{
		float percent=(total/5);
		return percent;
	}
	
	String grade(float percent)
	{
		if((percent>=90)&(percent<=100))
		{
			return "O";
		}
		else if((percent>=75)&(percent<=90))
		{
			return "A";
		}
		else if((percent>=50)&(percent<=75))
		{
			return "B";
		}
		else if((percent>=35)&(percent<=50))
		{
			return "C";
		}
		else 
		{
			return "failed";
		}
		
	}
	
	public static void main(String args[])
	{
		Student_Grade obj = new Student_Grade();
		int total=obj.marks();
		if(total!=0){
		
        System.out.println("Total Marks: "+ total);
		
		float percent= obj.percentage(total);
		System.out.println("Percentage: "+percent+"%");
		
		System.out.println("Grade: "+obj.grade(percent));
		}
	}
}