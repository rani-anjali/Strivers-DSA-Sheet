import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;
        HashMap<Long, Integer> map = new HashMap<>(); // Change the data type to Long

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put((long) sum, i); // Convert sum to long when putting it in the map
            }
        }

        return maxLen;
    }
}
