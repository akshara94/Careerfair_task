package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "mom";
		
		String rev =" ";
		
		for(int i = s.length()-1; i>=0; i--)
		
		rev = rev+s.charAt(i);
		
		if(s.equals(rev))
			
			System.out.println("String is not a palindrome");
		
		else
			
			System.out.println("String is  a palindrome");

	}

}
