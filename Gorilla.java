public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorilla threw a banana! watch out!!! ");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Yummy!!!!");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Climbed a tree.");
        energyLevel -= 10;
    }

}
