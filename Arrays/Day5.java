 
public class Day5 
{ 
    int[] nextPermutation(int[] arr) 
    {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        if (i >= 0) 
        {
            int j = arr.length - 1;
            while (arr[j] <= arr[i])
                j--;
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);
        return arr;
    }

    private void swap(int[] arr,int i,int j)
    {
        int tmp =arr[i];
        arr[i]  =arr[j];
        arr[j]  =tmp;
    }

    private void reverse(int[] arr,int left,int right)
    {
        while(left < right)
        {
            swap(arr, left, right);
            left++;right--;
        }
    }

}

    
    