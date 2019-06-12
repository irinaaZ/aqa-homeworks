package lesson7.task3;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SerializeClass {

    public static void serialize (Serializable serializableObj, String path){

        Map<String, Object> mapList = new HashMap<>();

        Class<?> cls = serializableObj.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Save2.class)) {
                field.setAccessible(true);
            }

            try {
                mapList.put(field.getName(), field.get(serializableObj));
            } catch (IllegalAccessException e) {
                System.out.println(e);
            }
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(mapList);
            System.out.println("Object was successfully written into file!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Object deserialize (Class <?> cls, String path){

        Map<String, Object> mapList = new HashMap<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            mapList = (HashMap<String, Object>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Object o = null;
        try {
            Constructor<?> ctr = cls.getConstructor();
            o = ctr.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Save2.class) && mapList.containsKey(field.getName())) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    field.set(o, mapList.get(field.getName()));
                } catch (IllegalAccessException e) {
                    System.out.println(e);
                }
            }
        }
        return o;
    }
}
