
public class Matrix2Dim {

	
	public static boolean isEvenRest(int n) {
		return ((n % 2) == 0) ? true : false;
	}
	public static boolean isOddRest(int n) {
		return ((n % 2) > 0) ? true : false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] [] matrix = new char [] [] {
				{'H','a','l','l','o'},
				{'I','n','f','o','r'},
				{'m','a','t','i','k'}
				};	// Feld mit 3 Zeilen und 5 Spalten

		//Zeilenweise durchlaufen
		System.out.println(matrix.length); //Zeilenzahl
		System.out.println(matrix[0].length); //Spaltenzahl erste Zeile 0
		int zeilenzahl=matrix.length;
		int spaltenzahl=matrix[0].length;
		
		for (int i=0; i<zeilenzahl; i++){
			for (int j=0; j<spaltenzahl; j++){
			
				System.out.print(matrix[i][j]);
			}
			
		}
		
		System.out.println();
		
		for (int j=0; j<spaltenzahl; j++)
		{
			for (int i=0; i<zeilenzahl; i++)
			{			
				if (isOddRest(j))					//ungerade
				{
					System.out.print(matrix[2-i][j]);
				}
				else
				{
					System.out.print(matrix[i][j]);	
				}
			
						
				
				}
			}
		
		
	}

}
