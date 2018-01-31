
public class Palindrom {
	
	public static void main(String[] args) {
		

	}
	
	
	public boolean isPalindrom(String str) {
		
		String strRevert = new StringBuilder(str).reverse().toString();
		boolean result = str.equals(strRevert);
				
		return result;
	}

}
