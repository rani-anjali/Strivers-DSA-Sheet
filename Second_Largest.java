public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            } else if (a[i] > secMax && a[i] < max) {
                secMax = a[i];
            }

            if (a[i] < min) {
                secMin = min;
                min = a[i];
            } else if (a[i] < secMin && a[i] > min) {
                secMin = a[i];
            }
        }

        int arr[] = {secMax, secMin};
        return arr;
    }
}
