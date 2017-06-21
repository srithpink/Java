import java.io.*;

public class Stor
{
	public static void main(String[] args) throws IOException
	{
	    int acc_no;
	    float beg_bal;
	    float charge;
	    float credit;
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	     System.out.println ("Enter Employee id");
	     acc_no = Integer.parseInt(br.readLine());

	     System.out.println("Begininng balance");
	     beg_bal = Float.parseFloat(br.readLine());

	     System.out.println("charges");
	     charge = Float.parseFloat(br.readLine());

	     System.out.println("Credit");
	     credit = Float.parseFloat(br.readLine());


	     float curr_bal = beg_bal + charge - credit;
	     System.out.println(curr_bal);
	     if(curr_bal <=0)
            {
                 System.out.println("balance limit is exceeded");
	        }
	     else
	        { 
                System.out.println("your current balance is " + curr_bal);
	        }  

    }
	        


}