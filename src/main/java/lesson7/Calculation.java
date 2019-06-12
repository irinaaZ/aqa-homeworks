package lesson7;

/*
1. Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод, помеченный этой аннотацией,
и передаст параметры аннотации в вызываемый метод.

"@Test(a=2, b=5)
public void test(int a, int b) {...}"
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Test{
    int a();
    int b();
}

public class Calculation {
    @Test(a = 2, b = 5)
    public static void test(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void main(String[] args) {
        Class <?> cls = Calculation.class;
        Method [] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)){
                Test test = method.getAnnotation(Test.class);
                try {
                    method.invoke(null,test.a(),test.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
