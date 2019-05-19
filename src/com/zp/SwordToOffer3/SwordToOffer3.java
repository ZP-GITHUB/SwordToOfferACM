package com.zp.SwordToOffer3;

/**
 * Created by ZP on 2019/5/19.
 * 将一个字符串中的空格替换成 "%20"。
 Input:
 "A B"
 Output:
 "A%20B"

 在字符串尾部填充任意字符，使得字符串的长度等于替换之后的长度。因为一个空格要替换成三个字符（%20），
 因此当遍历到一个空格时，需要在尾部填充两个任意字符。令 P1 指向字符串原来的末尾位置，P2 指向字符串现在
 的末尾位置。P1 和 P2 从后向前遍历，当 P1 遍历到一个空格时，就需要令 P2 指向的位置依次填充 02%（注意是
 逆序的），否则就填充上 P1 指向字符的值。从后向前遍是为了在改变 P2 所指向的内容时，不会影响到 P1 遍历原
 来字符串的内容。
 */
public class SwordToOffer3 {

    public static void main(String[] args) {
        StringBuffer intstr = new StringBuffer("A B ");

        StringBuffer outstr = replaceSpace(intstr);
        System.out.println(outstr);
    }

    private static StringBuffer replaceSpace(StringBuffer intstr) {
        int len1 = intstr.length()-1;
        for (int i = 0; i < len1; i++) {
            if(intstr.charAt(i) == ' '){
                intstr.append("  ");
            }
        }
        int len2 = intstr.length()-1;
        while (len1>=0 && len2>len1){
            char c = intstr.charAt(len1 --);//取了B的值后往前移1位
            if(c == ' '){
                intstr.setCharAt(len2--,'0');
                intstr.setCharAt(len2--,'2');
                intstr.setCharAt(len2--,'%');
            }else {
                intstr.setCharAt(len2--,c);
            }
        }
        return intstr;
    }
}
