package lesson4;

/*
"5. Hide all the field and methods which allow to change the inner state of the class(Encapsulation).
 */

public class Task {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob",5,13);
        System.out.println("Cat: " + cat. getName() + " " + cat.getAge());
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;

        private Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public int getAge() {
            return age;
        }

//        public void setAge(int age) {
//            this.age = age;
        }
    }
