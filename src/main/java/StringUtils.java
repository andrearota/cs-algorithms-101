
public class StringUtils {
	
	public static int find(String sub, String string) {

		int index = 0;
		
		while(index < string.length() - sub.length()) {
			
			int match = 0;
			
			while(match < sub.length() && string.charAt(index + match) == sub.charAt(match)) {
				match++;
			}
			
			if(match == sub.length()) {
				return index;
			} else {
				index += match + 1;
			}
			
		}
		
		return -1;
	}

}
