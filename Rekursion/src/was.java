
public class was {

	public static long was(long k) {
		if (k > 1)
			return k+ was(k-1);
		else return 1;
	}
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		System.out.println(was(7));
	}
	}




