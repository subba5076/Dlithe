import java.util.*;
class temp {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt() ;
      int n = sc.nextInt() ;
      System.out.println(" Enter the elements");
      int max = 0,Max=0;
      for(int i =0;i<m;i++){
          int counter = 0;
          System.out.println(" Row "+i+1);
         for(int j =0;j<n;j++){
             int num = sc.nextInt();
            if(num==1)counter++;
         }
        
         if(counter>max){
             max=counter;
             Max=i+1;
         }
    }
    System.out.println("row "+Max+" has most number of cars parked: "+max);
}}
