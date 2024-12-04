package org.tw.kata3;

/**
 * 练习3：异常断言练习
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
