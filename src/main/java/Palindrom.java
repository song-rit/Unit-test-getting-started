
public class Palindrom {
	
	public static void main(String[] args) {
		
		String str = new Palindrom().parseToPalindrom("123");
		System.out.println(new Palindrom().isPalindrom(str));

	}
	
	public boolean isPalindrom(String str) {
		
		String strRevert = new StringBuilder(str).reverse().toString();
		boolean result = str.equals(strRevert);
				
		return result;
	}
	
	public String parseToPalindrom(String str) {
		
		String strRevert = new StringBuilder(str).reverse().toString();
		return str + strRevert;
	}

}
