import java.util.*;

public class Principal {

	
	protected int daysSignUp;
	protected int[] scoreBooks;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> scoreBooks = new HashMap<Integer, Integer>();
		ArrayList<Library> Libraries = new ArrayList<Library>();
		int registeredLibraries = 0;
		ArrayList<Integer> idLibres = new ArrayList<Integer>();
		String prints = "";
		
		int totalBooks = sc.nextInt();
		int totaLibraries = sc.nextInt();
		int daysForScanning = sc.nextInt();
		
		for (int i = 0; i < totalBooks; i++) {
			scoreBooks.put(i, sc.nextInt());
		}
		
		for (int i = 0; i < totaLibraries; i++) {
			
			Library aux = new Library(i, sc.nextInt(), sc.nextInt(), sc.nextInt());
			Libraries.add(aux);
			
		}
		
		Collections.sort(Libraries);
		
		for (int i = daysForScanning; i > 0; i--) {
			
			i-=Libraries.get(0).getTime();
			
			if(i>0) {
				
				prints += Libraries.get(0).getId() + " " + (i-Libraries.get(0).getTime()) + "\n";
				
				Libraries.remove(0);
				++registeredLibraries;
				
			}
			
		}
		
	}

}
