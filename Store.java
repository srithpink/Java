import java.io.*;
public class Store{
	int macc_no;
	int mbeg_bal;
	int mchrge;
	int mcredit;
public Employee(int acc_no, int beg_bal,int charge, int credit){
	macc_no = acc_no;
	mbeg_bal = beg_bal;
	mchrge = charge;
	mcredit = credit;
}
public void display(){
          Float curr_bal = mbeg_bal + mchrge -credit;
          if(curr_bal <= 0){
          	System.out.println("balance limit exceeded");
          	 }else
          	 {
          	 	System.out.println("your current balance is " + curr_bal);
          	 }
}
public static void mainjava.io.(Strin[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter account no");
	int id = Integer.parseInt(br.readLine());
	System.out.println("Balance");
	Float bal = Float.parseFloat(br.readLine());
	System.out.println("Charges");
	Float  charg = Integer.parseInt(br.readLine());
	System.out.println("Credit");
	Float cred = Float.parseFloat(br.readLine());
	Store store = new Store(id,bal,charg,cred);
	store.display();

}

}