public class Samurai extends Human {

    private static int counter;

    public Samurai() {
        this.health = 200;
        counter++;
    }
    
    public void deathBlow(Human h) {
        this.health = this.health - this.health;
        System.out.println("I'm Dead." + this.health);
    }

    public void meditate() {
        health += health / 2;
    }

    public static int howMany() {
        return counter;
    }
}
