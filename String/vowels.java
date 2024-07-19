package String;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " GuviGuvi";
		
		int vcount = 0; 
		
		int ccount = 0;
		
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch =str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vcount++;
			}
			else if
			
			  ((ch >='a' && ch <= 'z'))
			  {
				ccount++;
			  }
		}
		System.out.println("Number of vowels : "  +vcount);
		
		System.out.println("Number of Consonants : " + ccount);
	}

}


