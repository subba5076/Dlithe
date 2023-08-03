package temp;
import java.util.*;

public class temp {  
    public static void main(String args[]) { 
    Map<Integer,Integer> mp = new HashMap<>();
System.out.println("Enter the number of elements");
String ans="";
int target=10;
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for(int x=0;x<n;x++) {
	int z = sc.nextInt();
	int diff=target-z;
if(mp.containsValue(diff)) {
	ans=ans+"("+z+","+diff+")";
}else {
	mp.put(diff,z);
}
}
System.out.println(ans);
    }
    		
    	}
       
         

    
  
