//输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,7,11,15], target = 9
//输出：[2,7] 或者 [7,2]
// 
//
// 示例 2： 
//
// 输入：nums = [10,26,30,31,47,60], target = 40
//输出：[10,30] 或者 [30,10]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10^5 
// 1 <= nums[i] <= 10^6 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 117 👎 0

package leetcode.editor.cn;
//java:和为s的两个数字
public class P剑指Offer57HeWeiSdeLiangGeShuZiLcof {
    public static void main(String[] args){
        Solution solution = new P剑指Offer57HeWeiSdeLiangGeShuZiLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0, y = 0;
        int r = nums.length - 1, l = 0;
        while (l <= r) {
            if (nums[r] + nums[l] == target) {
                x = nums[l];
                y = nums[r];
                break;
            }
            if (nums[r] >= target || nums[r] + nums[l] > target) {
                r --;
            } else {
                l ++;
            }
        }
        return new int[]{x, y};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}