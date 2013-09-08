
public class Vektoren {
	
	static double [] a=new double [3];
	static double [] b=new double [3];
	
	static double laenge() {
		return Math.sqrt(a[0]*a[0]+a[1]*a[1]+a[2]*a[2]);
			}
	
	static double skalarprodukt() {
		return (a[0]*b[0]+a[1]*b[1]+a[2]*b[2]);
	}
	
	public static void main(String[] args) {
		
	

		a[0]=1; b[0]=1;
		a[1]=1; b[1]=1;
		a[2]=1; b[2]=1;
		
		System.out.println("Länge "+laenge());
		System.out.println("Skalarprodukt "+skalarprodukt());
	}

}
