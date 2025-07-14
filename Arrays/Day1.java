//? this code to solve problem no 1 getSecondLargest element in arr

class Day1 
{
    public int getSecondLargest(int[] arr) 
    {
        if(arr.length == 1)
            return -1;
        int max,secMax;
        max =secMax =-1;
        for(int val :arr)
        {
            if(val > max)
            {
                secMax =max;
                max =val;
            }
            else if(val > secMax && val < max)
                secMax =val;
        }
        return  secMax;
    }
}