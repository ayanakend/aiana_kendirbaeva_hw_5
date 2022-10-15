public class Main {
    public static void main(String[] args) {
        Boss b1 = new Boss( );
        b1.setHealth(400);
        b1.setDamage(140);
        b1.setProtectionType("Lasers");
        System.out.println("Boss health: " + b1.getHealth() + " " + "Boss damage: " + b1.getDamage() + " " + "Boss protection type: " + b1.getProtectionType());
        createHeroes();
    }

    public static Hero createHeroes() {
        Hero h1 = new Hero();
        h1.getHealth(280);
        h1.getDamage(40);
        h1.getSuperpower("bulletproof");
        System.out.println("Heroes health: " + h1.getHealth(280) + " " + "Heroes damage: " + h1.getDamage(40) + " " + "Heroes superpower: " + h1.getSuperpower("bulletproof"));
        Hero h2 = new Hero();
        h2.getHealth(300);
        h2.getDamage(45);
        h2.getSuperpower("invisibility");
        System.out.println("Heroes health: " + h2.getHealth(300) + " " + "Heroes damage: " + h2.getDamage(45) + " " + "Heroes superpower: " + h2.getSuperpower("invisibility"));
        Hero h3 = new Hero();
        h3.getHealth(250);
        h3.getDamage(35);
        System.out.println("Heroes health: " + h3.getHealth(250) + " " + "Heroes damage: " + h3.getDamage(35));
        return null;
    }
}