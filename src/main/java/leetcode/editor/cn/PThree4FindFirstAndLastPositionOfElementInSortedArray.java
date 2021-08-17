//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums 是一个非递减数组 
// -109 <= target <= 109 
// 
// Related Topics 数组 二分查找 
// 👍 1125 👎 0

package leetcode.editor.cn;
//java:在排序数组中查找元素的第一个和最后一个位置
public class PThree4FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args){
        Solution solution = new PThree4FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 7, 8, 10}, 7);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = -1, e = -1;
        int length = nums.length;
        int l = 0;
        int r = length - 1;
        int m = (l + r) / 2;
        // 起始
        while (m >= l && m <= r) {
            if (nums[m] == target) {
                s = m;
                e = m;
                for (int i = s; i >= 0; i --) {
                    if (nums[i] == target) {
                        s = i;
                    }
                    if (nums[i] < target)
                        break;
                }
                for (int i = s; i < length; i ++) {
                    if (nums[i] == target) {
                        e = i;
                    }
                    if (nums[i] > target)
                        break;
                }
            }
            if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            m = (l + r) / 2;
        }

        return new int[]{s, e};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}