package LeetCode.Day318;
/**
 * @ Description   :  https://leetcode-cn.com/problems/defanging-an-ip-address/
 * @ Author        :  Adios
 * @ CreateDate    :  2020-03-18 13:27
 */

public class IP地址无效化 {
    // 普通遍历方法即可。当遇到'.' 就加上"[.]"
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)=='.') {
                sb.append("[.]");
            }
            else sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}
