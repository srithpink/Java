import java.util.Scanner;
import java.io.*;

class Salesperson
{
	public static void main(String[] args)
	{
	 	Scanner scan = new Scanner(System.in);
	 	int noOfUnits = 0;
	 	int counter;
	 	System.out.println("Enter the no of elements");
	 	int noOfElements = scan.nextInt();
	 	int arr[] = new int[noOfElements];
	 	System.out.println("Enter the number of units");
	 	  for(counter =0;counter < noOfElements;counter++)
	 	    {
               arr[counter]=scan.nextInt();
	 	    } 
	 	  int largest =arr[0];
	 	 for(int a =0; a < noOfElements; a++)
	 	   {
               if(largest < arr[a])
               {
                   largest = arr[a];
               }
	 	   }
	 	  System.out.println("The largest no is " + largest);     

	 }
}