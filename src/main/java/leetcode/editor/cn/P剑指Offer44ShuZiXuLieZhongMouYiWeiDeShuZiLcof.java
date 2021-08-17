//数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，
//等等。 
//
// 请写一个函数，求任意第n位对应的数字。 
//
// 
//
// 示例 1： 
//
// 输入：n = 3
//输出：3
// 
//
// 示例 2： 
//
// 输入：n = 11
//输出：0 
//
// 
//
// 限制： 
//
// 
// 0 <= n < 2^31 
// 
//
// 注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/ 
// Related Topics 数学 二分查找 
// 👍 140 👎 0

package leetcode.editor.cn;
//java:数字序列中某一位的数字
public class P剑指Offer44ShuZiXuLieZhongMouYiWeiDeShuZiLcof {
    public static void main(String[] args){
        Solution solution = new P剑指Offer44ShuZiXuLieZhongMouYiWeiDeShuZiLcof().new Solution();
        int nthDigit = solution.findNthDigit(24);
        System.out.println(nthDigit);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit; // 2.
        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}