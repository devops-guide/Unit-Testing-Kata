# Unit Test Kata

## 前置准备
### Idea 设置
设置使用 IntelliJ 运行测试，信息会更友好。

## 练习1：基本断言练习

为以下代码编写单元测试
```java
/**
 * 练习1：基本断言练习
 */
public class CalculatorSimple {
    public int add(int a, int b) {
        return a + b;
    }
}
```

## 练习2：空断言练习

为以下代码编写单元测试
```java
/**
 * 练习2：空断言练习
 */
public class UserService {
    public User getUserById(int id) {
        // 模拟查找用户，返回 null 表示用户不存在
        return null;
    }
}

```

## 练习3：异常断言练习

为以下代码编写单元测试
```java
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
```

## 练习4：参数化练习

为以下代码编写单元测试
```java
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
```



### 运行全部测试
```shell
./gradlew clean test --info
```