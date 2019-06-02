package lesson4;

/*
"3. Create a class Dog.
The dog should have a name and an age (private).
Create getters and setter for all the fields."

1) When you will be creating setters - keep in mind that fields shouldn't
be empty and age can't be less of equals to zero.
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age <= 0)||(Integer.toString(age).length() == 0)){
            throw new IllegalArgumentException("Age cannot be zero or negative");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex",10);

        dog1.setName("");
        dog1.setAge(-7);
        System.out.println(dog1.age + dog1.name);
    }
}
