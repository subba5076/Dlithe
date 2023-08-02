package temp;
import java.util.*;

public class temp {
	public static void main(String args[]) {
		    	
		String s = "####*";
		int countr=0;
		char hash='#';
		
		char arr[]=new char[s.length()];

		arr=s.toCharArray();
		System.out.println(arr);
		for(int i=0;i<s.length();i++){
			
		  if(arr[i]==hash) {
			  countr++;
		  }
		}
		int star=s.length()-countr;
		if(star>countr){
		    System.out.println("negative");
		}else if(star<countr){
		    System.out.println("positive");
		    
		}else{
		    System.out.println("0");
		}
		    
		}
	  }
