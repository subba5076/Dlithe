//hackerank problem
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

       bufferedReader.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }


        
    
}}
