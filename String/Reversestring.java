package String;

public class Reversestring {

	public static void main(String[] args) {
		
		
		String str = "akshara";
		String reversedstr = " ";
		
		for(int i=str.length()-1; i>=0; i--) {
			
		reversedstr = reversedstr + str.charAt(i);
		
		}
		
		System.out.println("Original string  : " +str);
		
		System.out.println("Reverse String :" + reversedstr);
			
		}

	}


