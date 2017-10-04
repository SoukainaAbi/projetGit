package projetJava;

public class ChaineCryptee {

	
	public String chaine;
	public int d;
	
	public ChaineCryptee(String chaine,int d) {
		this.chaine=chaine;
		this.d=d;
	}
	
	public static String decrypte(String chaine) {
		return chaine;
	}
	
	public static char decaleCaractere(char c,int d) {
		return (c <'A' || c > 'Z')? c : (char)(((c - 'A' + d) % 26) + 'A');
	}
	
	public static String crypte(String chaine) {
		String result="";
		for(int i=0;i<chaine.length();i++) {
			char car=chaine.charAt(i);
			char c=decaleCaractere(car,2);
			result+=c;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine="SOUKAINA";
		String result1=decrypte(chaine);
		String result2=crypte(chaine);
		
		System.out.println("la chaine decryptée est  : " +result1+ " chaine cryptée est : " + result2);
	}

}
