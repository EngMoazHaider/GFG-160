//? this code to solve problem no 3 Rverse an array
public class Day3 
{
    public void reverseArray(int arr[]) 
    {
        int left =0,right =arr.length-1;
        while(left < right)
        {
            int tmp =arr[left];
            arr[left] =arr[right];
            arr[right] =tmp;
            left++;
            right--;
        }
        
    }
}
