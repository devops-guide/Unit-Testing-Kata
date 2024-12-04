package org.tw.kata4;

/**
 * 练习4：参数化练习
 */
public class CalculatorSimple {
    // 除法
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("不能除以零");
        }
        return (double) a / b;
    }
}
