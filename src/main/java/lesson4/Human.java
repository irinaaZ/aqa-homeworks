package lesson4;

/*
"1. Create a class ""Human"". A human should have the following attributes:
weight, age, first name, last name, height."

"1) Create a class Human with all the required fields to store the information
(variable types you could choose by yourself).
2) Add to the class a constructor with parameters which initialize all the fields."
 */

public class Human {
    private double weight;
    private double height;
    private int age;
    private String firstName;
    private String lastName;

    public Human(double weight, double height, int age, String firstName, String lastName) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Human humanTest = new Human(78.5,185.3,28,"John", "Johnes");
        System.out.println("Information about person: " + humanTest.toString());
    }
}
