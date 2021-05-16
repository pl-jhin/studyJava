package Solution;

/*
    首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，qing返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。

示例 1:

输入: "42"
输出: 42
示例 2:

输入: "   -42"
输出: -42
解释: 第一个非空白字符为 '-', 它是一个负号。
     我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
示例 3:

输入: "4193 with words"
输出: 4193
解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
示例 4:

输入: "words and 987"
输出: 0
解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
     因此无法执行有效的转换。
示例 5:

输入: "-91283472332"
输出: -2147483648
解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
     因此返回 INT_MIN (−231) 。

 */
public class myAtoi {
    public static int myAtoi(String str) {
        int num=0,k=0;
        int length=str.length();
        if(length==0)return 0;
        //判断第一步是不是符合条件
        for(k=0;k<length;k++)
            if(str.charAt(k)!=' ')break;
        if((k>=length)||(str.charAt(k)!='+'&&str.charAt(k)!='-')&&(str.charAt(k)<'0'||str.charAt(k)>'9'))
            return 0;

        //判断是否为符号位
        boolean b=true;
        if(str.charAt(k)=='+'||str.charAt(k)=='-'){
            b=(str.charAt(k)=='+')?true:false;
            k+=1;
        }
        //查找数字
        for(int i=k;i<length;i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9')break;
            //判断是否越界
            if(num>Integer.MAX_VALUE/10||num==Integer.MAX_VALUE/10&&str.charAt(i)>'7')
                return (b)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            num=num*10+Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return (b)?num:-num;
    }


    public static void main(String[] args) {
        String s ="    -44a4";
        System.out.println(myAtoi(s));
    }
}
