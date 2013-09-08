
public class Strings1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hallo";
		String b="Neigungsfach 11 Info";
		String c= a+" "+b;
		
		System.out.println(c);
		System.out.println("Länge "+c.length());
		//System.out.println(c.charAt(1));
		
		for(int i=0;i<c.length();i=i+2){
			
			System.out.print(c.charAt(i));
			
		}	
		
		System.out.println("\n"+c.toUpperCase());
		System.out.println("\n"+c.toLowerCase());
		System.out.println("\n"+c.startsWith("Ha"));
		System.out.println("\n"+c.endsWith("nfo"));
		System.out.println("\n"+c.indexOf('l'));
		System.out.println("\n"+c.substring(0, 7));
	}

}
