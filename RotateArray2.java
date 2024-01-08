import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        rotateHelp(arr, 0, k-1);
        rotateHelp(arr, k, arr.size()-1);
        rotateHelp(arr, 0, arr.size()-1);
        return arr;
    }
    public static ArrayList<Integer> rotateHelp(ArrayList<Integer> arr, int start, int end)
    {
        while(start<end)
        {
        swap(arr,start,end);
        start++;
        end--;
        }
        return arr;
    }
    public static void swap(ArrayList<Integer> arr,int start, int end)
    {
        int temp=arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end,temp);
    }
}