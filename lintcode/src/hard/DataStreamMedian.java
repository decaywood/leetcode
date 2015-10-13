package hard;

/**
 * @author: decaywood
 * @date: 2015/10/13 20:42
 *
 * Numbers keep coming, return the median of numbers at every time a new number added.
 *
 * Example
 * For numbers coming list: [1, 2, 3, 4, 5], return [1, 1, 2, 2, 3].
 *
 * For numbers coming list: [4, 5, 1, 3, 2, 6, 0], return [4, 4, 4, 3, 3, 3, 3].
 *
 * For numbers coming list: [2, 20, 100], return [2, 2, 20].
 *
 * Challenge
 * Total run time in O(nlogn).
 *
 * Clarification
 * What's the definition of Median? - Median is the number that in the middle of a sorted array.
 * If there are n numbers in a sorted array A, the median is A[(n - 1) / 2]. For example, if A=[1,2,3],
 * median is 2. If A=[1,19], median is 1.
 *
 */
public class DataStreamMedian {

    private static class Tree {
        Tree left;
        Tree right;
        int val;

        public Tree(int val) {
            this.val = val;
        }
    }

    public int[] medianII(int[] nums) {
        int[] res = new int[nums.length];
        if(nums.length == 0) return res;
        Tree heap = new Tree(nums[0]);
        for (int i = 1; i < nums.length; i++) {

        }
        return res;
    }

    public static void main(String[] args) {
        new DataStreamMedian().medianII(new int[]{4, 5, 1, 3, 2, 6, 0});
    }

}
