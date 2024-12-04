package org.tw;

public class Calculator {
    // 加法
    public int add(int a, int b) {
        return a + b;
    }

    // 减法
    public int subtract(int a, int b) {
        return a - b;
    }

    // 乘法
    public int multiply(int a, int b) {
        return a * b;
    }

    // 除法
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("不能除以零");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 测试加法
        System.out.println("加法测试: 3 + 5 = " + calculator.add(3, 5)); // 8

        // 测试减法
        System.out.println("减法测试: 10 - 4 = " + calculator.subtract(10, 4)); // 6

        // 测试乘法
        System.out.println("乘法测试: 7 * 6 = " + calculator.multiply(7, 6)); // 42

        // 测试除法
        try {
            System.out.println("除法测试: 20 / 4 = " + calculator.divide(20, 4)); // 5.0
            System.out.println("除法测试: 20 / 0 = " + calculator.divide(20, 0)); // 会抛出异常
        } catch (IllegalArgumentException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
}