package lesson4;

/*
2. Implement the method fight() depending on weight, strength and age of the boxer:
You should write dependency by yourself. The method should return true or false if our boxer won or lost.

1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
 */
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int ageScore = this.age > anotherBoxer.age ? 1:0;
        int weightScore = this.weight > anotherBoxer.weight ? 1:0;
        int strengthScore = this.strength > anotherBoxer.strength ? 1:0;

        int totalScore = ageScore + weightScore + strengthScore;
        return totalScore >= 2;
        }

    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(35, 98, 30);
        Boxer boxer2 = new Boxer(32, 197, 25);

        System.out.println(boxer1.fight(boxer2));
    }
}

