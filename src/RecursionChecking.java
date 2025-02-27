
public class RecursionChecking {
	
	public static int recusioncheck(int n) {
		if(n == 0) {
			return 1;
		} else {
			return recusioncheck(n-1) + recusioncheck(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int result = recusioncheck(n);
		System.out.println(result);

	}

}
