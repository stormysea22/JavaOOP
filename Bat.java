public class Bat extends Mammal {
    
    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("flutter!!!");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Yum");
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("sizzle!!!! burn!!!");
        this.energyLevel -= 100;
    }
}
