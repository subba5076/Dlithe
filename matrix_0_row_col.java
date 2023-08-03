import java.util.HashSet;  
import java.util.Set;  
public class SetMatrixElementsToZero  
{  
   
public static void setZero(int[][] array)   
{  
Set<Integer> rowsToZero = new HashSet<>();  
Set<Integer> columnsToZero = new HashSet<>();  
 
for (int i = 0; i < array.length; i++)   
{  
    
for (int j = 0; j < array.length; j++)   
{  
   
if (array[i][j] == 0)   
{  
     
rowsToZero.add(i);  
columnsToZero.add(j);  
}  
}  
}  

for (int i : rowsToZero)   
{  
for (int j = 0; j < array.length; j++)   
{  
array[i][j] = 0;  
}  
}  

for (int i : columnsToZero)   
{  
for (int j = 0; j < array.length; j++)   
{  
array[j][i] = 0;  
}  
}  
  
for (int i = 0; i < array.length; i++)    
{  
    
for (int j = 0; j < array.length; j++)   
{  
    
System.out.print(array[i][j]+"\t");  
if(j == array.length-1)  
 
System.out.println();  
}  
}  
}  

public static void main(String args[])   
{  
     
int[][] arr = { { 1, 0, 1, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };  
 
setZero(arr);  
}  
}  
