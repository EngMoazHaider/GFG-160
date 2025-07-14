public class Day4 
{
    // Function to rotate an array by d elements in counter-clockwise direction.
    //? this method to rotate an arr using another one O(n) O(n)
    void rotateArr(int arr[], int d) 
    {
        int[] rotatedArr = new int[arr.length];
        int mod = d % arr.length;
        int index =0;
        for(int i =mod ; i < arr.length ;i++)
            rotatedArr[index++] =arr[i];
        for(int i =0 ; i < mod ;i++)
            rotatedArr[index++] = arr[i];
        for(int i =0 ; i < arr.length ; i++)
            arr[i] = rotatedArr[i];
    }
    

    //? this method to rotate the arr using reverse its element O(n) O(1)
    /*
     * ex  arr = 1 2 3 4 5   d = 2
     *   step1 reverse all array element
     *     arr =5 4 3 2 1 
     *   step2 calulate the mod by size of array 
     *     mod = 2 % 5 = 2    
     *   step3 reverse all element from start of array to the length - mod = 5 -2 =3 so reverse first three element
     *     arr = 3 4 5 2 1
     *   step4 reverse the element in last of array from the length - mod to end of array
     *     arr = 3 4 5 1 2
     */
    void rotateArr1(int arr[], int d) 
    {
        reverseSubArray(arr,0,arr.length-1);
        int mod = d%arr.length;
        reverseSubArray(arr,0,arr.length-1-mod);
        reverseSubArray(arr,arr.length-1-mod+1,arr.length-1);
    }

    void reverseSubArray(int[] arr, int left, int right)
    {
        while(left < right)
        {
            int tmp = arr[left];
            arr[left] =arr[right];
            arr[right] =tmp;
            left++;
            right--;
        }
    }  
}
