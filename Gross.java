import java.util.Scanner;
import java.io.*;
class Gross
{
	public static void main(String[] args) throws IOException
	{
		float baseSalaryRate = 0;
		int noOfHours,noOfExtraHours,noOfEmployees;
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the no of employees");
		noOfEmployees = scan.nextInt();

		System.out.println("Enter noOfHours");
		noOfHours = scan.nextInt();

		System.out.println("Enter basicSalaryRate");
		baseSalaryRate = scan.nextFloat();

        for(int i = 0; i < noOfEmployees; i++)
        {	

		      if(noOfHours > 0 && noOfHours <= 40)
                {
			      float grossSalary = baseSalaryRate * noOfHours;
			      System.out.println(grossSalary);
		        }
		      else if(noOfHours > 40)
		        {
		 	      noOfExtraHours = noOfHours - 40;
		 	      float grossSalary = (baseSalaryRate * 40)  + ((baseSalaryRate/2) + baseSalaryRate) * noOfExtraHours;
		 	      System.out.println(grossSalary);
		        } 
		      else  
		        {
                   System.out.println("Invalid input");
		        }
		}         
	}
}