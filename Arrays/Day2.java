//? this code to solve problem no 2 Move All Zeroes to End of arr
public class Day2 
{
    void pushZerosToEnd(int[] arr) 
    {
         int j =0;
         for(int i =0; i < arr.length; i++)
         {
             // if the element in index i no equal zero swap it with element in index j 
             if(arr[i] != 0  )
             {
                 int tmp =arr[i];
                 arr[i] =arr[j];
                 arr[j] =tmp;
                 j++;
             }
         }
    }
    
}
