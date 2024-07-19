package String;

import java.util.Scanner;

public class Repeatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  
		        
		System.out.println("Input a String:");  
		        
		String word = sc.next();  
		       
		boolean flag = true;  
		  
		        for(char i :word.toCharArray())  
		        {  
		            if (word.indexOf(i) == word.lastIndexOf(i))  
		            {  
		                System.out.println("The first character which is not repeating is: "+ i);  
		                flag = false;  
		                break;  
		            }  
		        }  
		        if(flag== true){  
		            System.out.println("There is no non-repeating character in the input string");  
		}  
		        sc.close();
		     }  
	
		}  

	


