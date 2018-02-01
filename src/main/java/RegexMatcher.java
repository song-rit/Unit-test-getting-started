import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	
	public boolean isLoginPattern(String str) {
		
		String patternStr = "";
		
		// Create pattern object
		Pattern pattern = Pattern.compile(patternStr); 
		
		// Create Matcher object
		Matcher matcher = pattern.matcher(str);
				
		if(matcher.find()) {
			return false;
		}
		
		return true;
	}
	
	public boolean isNumberPattern(String str) {
		
		String patternStr = "(\\d)";
		
		Pattern pattern = Pattern.compile(patternStr);
		
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			return true;
		}
		
		return false;
		
	}
	
	
	public boolean isLetterPattern(String str) {
		
		String patternStr = "(\\w)";
		
		Pattern pattern = Pattern.compile(patternStr);
		
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			
			return true;
		}
		
		return false;
	}
	
	public boolean isWhiteSpacePattern(String str) {
		
		String patternStr = "(\\s)";
		
		Pattern pattern = Pattern.compile(patternStr);
		
		Matcher matcher = pattern.matcher(str);
		
		if(matcher.find()) {
			
			return true;
		}
		
		return false;
	}
	
	

}
