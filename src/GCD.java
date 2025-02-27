
public class GCD {
	
	public static int GCDrecursion(int m, int n) {
		if(m%n==0) {
			return n;
		} else { 
			return GCDrecursion(n, m%n);
			} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 205;
		int n = 123;
		int result = GCDrecursion(m,n);
		System.out.println("The gretest common divisor for "+m+" & "+n+" is="+result);
		

	}

}
