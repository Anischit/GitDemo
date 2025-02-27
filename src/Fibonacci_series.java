
public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 =0,fib2 =1;
		System.out.println(fib1+"\n"+fib2);
		for(int i=2;i<10;i++) {
			int fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
		

	}

}
