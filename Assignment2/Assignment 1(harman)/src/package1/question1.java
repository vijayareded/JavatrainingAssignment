package package1;

public class question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FibonacciNumber fib = new FibonacciNumber();
	     fib.printFibAndAvg(20);
	}
	
	private void printFibAndAvg(int n) {
        long   f1 = 1;
        long   f2 = 1;
        long   fn = 0;
        long   sum = 0;
        
        if (n <= 0) {
            System.out.println("Please correct number of items and try again.");
            return;
        }
        
        System.out.println("The first " + n + " Fibonacci numbers are:");
        
        for(int i = 1; i <= n; i++) {
            switch (i) {
                case 1: fn = f1; 
                	break;
                case 2: fn = f2; 
                	break;    
                default:
                    fn = f1 + f2;
                    f1 = f2;
                    f2 = fn;
            }
        sum += fn;
        System.out.print(fn + " ");
    }
    System.out.println(); 
    System.out.printf("The average is %.4f \n", (double)sum / n);
}
}
