import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day6 
{ 
    //? first solution using freq Array with size = maximum number will input it
    //? time O(n) space O(k) k = maximum number
    public ArrayList<Integer> findMajority(int[] arr) 
    {
        int[] freq = new int[100001];
        for(int i = 0; i < arr.length;i++)
        {
            freq[arr[i]]++;
        }
        ArrayList<Integer> ma = new ArrayList<>();
        for(int i =0; i < freq.length;i++)
        {
            if(freq[i] > (arr.length/3))
                ma.add(i);
        }
        return ma;
        
    }      
    
    //? second one is optimze using hash map time O(n) space O(k) k is number of distinc numbers
    public ArrayList<Integer> findMajority1(int[] arr) 
    {
        ArrayList<Integer> maj =new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int val : arr)
            freq.put(val, freq.getOrDefault(val,0)+1);
        int target =arr.length/3;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet())
            if(entry.getValue() > target)
                maj.add(entry.getKey());
        return maj;
    }
}
