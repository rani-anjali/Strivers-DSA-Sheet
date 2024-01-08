import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		HashSet<Integer> hs=new HashSet<>(arr);
		
		return hs.size();
	}
}