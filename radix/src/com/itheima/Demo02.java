package com.itheima;

/*
    java.lang.Integer 类中的静态方法：

    public static String toBinaryString​(int i):在基数2中返回整数参数的字符串表示形式为无符号整数
    public static String toOctalString​(int i):在基数8中返回整数参数的字符串表示形式为无符号整数
    public static String toHexString​(int i):返回整数参数的字符串表示形式，作为16位中的无符号整数

    public static String toString​(int i,int radix)：返回由第二个参数指定的基数中的第一个参数的字符串表示形式
 */
public class Demo02 {
    public static void main(String[] args) {
//        public static String toBinaryString​(int i):在基数2中返回整数参数的字符串表示形式为无符号整数
        System.out.println(Integer.toBinaryString(42));
//        public static String toOctalString​(int i):在基数8中返回整数参数的字符串表示形式为无符号整数
        System.out.println(Integer.toOctalString(42));
//        public static String toHexString​(int i):返回整数参数的字符串表示形式，作为16位中的无符号整数
        System.out.println(Integer.toHexString(42));
        System.out.println("--------------------");

//        public static String toString​(int i,int radix)：返回由第二个参数指定的基数中的第一个参数的字符串表示形式
        System.out.println(Integer.toString(0b101010,10));
        System.out.println(Integer.toString(052,10));
        System.out.println(Integer.toString(0x2A,10));
        System.out.println(Integer.toString(0x2a,10));
        System.out.println("--------------------");

        System.out.println(Integer.toString(0b101010,8));
        System.out.println(Integer.toString(0b101010,16));
    }
}
