package lesson7.task3;

import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Save2 {
}

public class Container implements Serializable{
    @Save2
    private String s;
    @Save2
    private int num;
    @Save2
    private char c;
    @Save2
    private double d;

    public Container(String s, int num, char c, double d) {
        this.s = s;
        this.num = num;
        this.c = c;
        this.d = d;
    }

    public Container(){}

    public void setS(String s) {
        this.s = s;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }


    public static void main(String[] args) {
        Container container1 = new Container("text",444,'m',87.99);
        Container container2 = new Container("hello",3232,'g',1.0);

        //serialize
        SerializeClass.serialize(container1,"c:\\file1.txt");
        SerializeClass.serialize(container2,"c:\\file2.txt");

        //deserialize
        Container containerDeserialize1 = (Container) SerializeClass.deserialize(Container.class,"c:\\file1.txt");
        Container containerDeserialize2 = (Container) SerializeClass.deserialize(Container.class,"c:\\file2.txt");

        //print
        System.out.println("The first object deserialized values: " + containerDeserialize1.s + ", " + containerDeserialize1.c + ", " + containerDeserialize1.d + ", " + containerDeserialize1.num);
        System.out.println("The second object deserialized values: " + containerDeserialize2.s + ", " + containerDeserialize2.c + ", " + containerDeserialize2.d + ", " + containerDeserialize2.num);
    }
}

