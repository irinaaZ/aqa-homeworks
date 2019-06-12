package lesson7;

/*
"2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
который сохранит поле класса TextContainer в указанный файл."

"@SaveTo(path=“c:\\file.txt”)
class Container {
String text = “...”;
@Saver
public void save(..) {...}
}"
 */

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(value= ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo{
    String path();
}

@Target(value= ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver{
}

@SaveTo(path="c:\\file.txt")
public class TextContainer {
    private static String str = "12345";

    @Saver
    public static void save(String path) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(str);
            System.out.println("SUCCESS! String value was added into .txt file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Class <?> cls = TextContainer.class;
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)){
                SaveTo saveTo = cls.getAnnotation(SaveTo.class);
                try {
                    method.invoke(cls,saveTo.path());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


