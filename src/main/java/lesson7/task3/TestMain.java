package lesson7.task3;

import java.lang.annotation.*;

@Inherited
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Save {
}

@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {
    String path() default "C:\\task3.txt";
}

@SaveTo
class MyContainer{
    @Save
    private int anInt;
    @Save
    private String string;
    @Save
    private Character character;

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}


public class TestMain{
    public static void main(String[] args) {
        MyContainer myContainer = new MyContainer();
        myContainer.setAnInt(878);
        myContainer.setString("text");
        myContainer.setCharacter('m');
    }

}
