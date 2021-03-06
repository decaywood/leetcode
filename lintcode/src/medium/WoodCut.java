package medium;

import java.util.Arrays;

/**
 * @author: decaywood
 * @date: 2015/8/26 22:54.
 *
 * Given n pieces of wood with length L[i] (integer array).
 * Cut them into small pieces to guarantee you could have equal or more than k pieces with the same length.
 * What is the longest length you can get from the n pieces of wood? Given L & k,
 * return the maximum length of the small pieces.
 *
 * Example
 * For L=[232, 124, 456], k=7, return 114.
 *
 * Note
 * You couldn't cut wood into float length.
 *
 * Challenge
 * O(n log Len), where Len is the longest length of the wood.
 *
 */
public class WoodCut {

    public static int woodCut(int[] L, int k) {
        if(L.length == 0) return 0;
        long sum = 0;
        for (int i : L) sum += i;
        if(sum < k) return 0;
        Arrays.sort(L);
        long left = 1;
        long right = L[L.length - 1];
        if(right < k) return L.length;
        long res = 0;
        while (left <= right) {
            long middle = (left + right) / 2;
            if(middle == 0) break;
            int pieces = calculatePieces(L, middle);
            if(right - left <= 2) {
                res = calculatePieces(L, right) >= k ? right : pieces >= k ? middle : left;
                break;
            }
            left = pieces < k ? left : middle;
            right = pieces < k ? middle : right;
        }
        return (int) res;
    }

    private static int calculatePieces(int[] L, long len) {
        int sum = 0;
        for (int length : L) sum += length / len;
        return sum;
    }



}
