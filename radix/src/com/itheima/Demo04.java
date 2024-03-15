package com.itheima;

import java.math.BigDecimal;

/*
    浮点数运算
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(2.0F - 1.5F);
        System.out.println(2.0F - 1.3F);
        System.out.println(2.0F - 1.4F);

        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.3");
        System.out.println(bd1.subtract(bd2));
    }
}
