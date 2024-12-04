package org.tw.example;

import org.junit.jupiter.api.Test;
import org.tw.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        // 测试加法
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        // 测试减法
        assertEquals(6, calculator.subtract(10, 4));

        testMultiply();
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();

        // 测试乘法
        assertEquals(42, calculator.multiply(7, 6));

    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        // 测试除法
        assertEquals(5.0 , calculator.divide(20, 4));
    }

    @Test
    void testDivideThrowException() {
        // 测试除法
        Calculator calculator = new Calculator();
        // 断言抛出 IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });

        // 验证异常消息
        assertEquals("不能除以零", exception.getMessage());
    }
}
