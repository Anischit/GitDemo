
public class Recusion {
	
	public static int recursion(int m) {
		if(m == 0 || m == 1) {
			return 1;
		} else {
			return m*recursion(m-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 6;
		int result = recursion(number);
		System.out.println("the result of "+number+"!"+" is = "+ result);
		

	}

}
