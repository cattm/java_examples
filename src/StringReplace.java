
public class StringReplace {

	// just shows off how to do simple replace and reverse patterns
	
	String theBase = "ABCDEF12345";
	public static String replace(String str, char ch, char replace) {
		String mystring = str.replace(ch, replace);
		return mystring;
	}
	
	public static String reverse(String str) {
		StringBuilder strB = new StringBuilder();
		char[] strchars = str.toCharArray();
		
		for (int i = strchars.length - 1; i >=0; i--){
			strB.append(strchars[i]);
			
	
		}
		return strB.toString();
	}
	
	public static String recursivereverse (String str) {
		if (str.length() < 2) return str;
		return recursivereverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = replace("the quick brown fox", 'b', 'c');
		System.out.println("Result String is " + result);
		
		
		result = reverse("Marcus is a good boy");
		System.out.println("Result String is " + result);
		
		result = recursivereverse ("And Tersea is a girl");
		System.out.println("Result String is " + result);
		
		// plain reverse is
		result = new StringBuffer("Silly string to prove a point").reverse().toString();
		System.out.println("Result String is " + result);
	}

}
