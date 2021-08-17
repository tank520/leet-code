//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 
// 👍 1915 👎 0

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;
import java.lang.StringBuilder;

//java:括号生成
public class PTwo2GenerateParentheses {
    public static void main(String[] args){
        Solution solution = new PTwo2GenerateParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList<>();
        recur(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void recur(List<String> ans, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            ans.add(sb.toString());
            return;
        }
        if (open < max) {
            sb.append("(");
            recur(ans, sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            recur(ans, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}