package package3;

public class BankingSystem {
public static void main(String[] args) {
		
		Account acc1=new SavingsAccount("seema", "4343433434", 30000, 5, 1000);
	
		
		Account acc2=new 
			CurrentAccount("geeta", "543545445", 500000, "AB1234", 50000);
		
		
		System.out.println(acc1);
		System.out.println(acc2);
		
	}
}


