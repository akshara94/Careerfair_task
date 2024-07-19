package String;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Grab";
		
		String str2 = "Brag";
		
		str1 = str1.toLowerCase();
		
		str2 = str2.toLowerCase();

		if(str1.length() != str2.length()) {
		
			System.out.println("Both the Strings are not anagram");
		}
			
	
		else {
			
		
			System.out.println("both the Strings are anagram");
	

	}

	
	}

}
