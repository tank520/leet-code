//给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。 
//
// 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [100,4,200,1,3,2]
//输出：4
//解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。 
//
// 示例 2： 
//
// 
//输入：nums = [0,3,7,2,5,8,4,6,0,1]
//输出：9
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 
// Related Topics 并查集 数组 哈希表 
// 👍 840 👎 0

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

//java:最长连续序列
public class POne28LongestConsecutiveSequence {
    public static void main(String[] args){
        Solution solution = new POne28LongestConsecutiveSequence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sets = new HashSet();
        for (int num : nums) {
            sets.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            if (!sets.contains(num - 1)) {
                int cur = 1;
                int curNum = num;
                while (sets.contains(curNum + 1)) {
                     cur ++;
                     curNum ++;
                }
                longest = Math.max(longest, cur);
            }
        }
        return longest;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}