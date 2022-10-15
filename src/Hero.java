public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public void heroStatistic(int theHealth, int theDamage, String theSuperpower) {
        health = theHealth;
        damage = theDamage;
        superpower = theSuperpower;
    }

    public void heroStatistic(int theHealth, int theDamage) {
        health = theHealth;
        damage = theDamage;
    }

    public int getHealth(int health) {
        return health;
    }

    public int getDamage(int damage) {
        return damage;
    }

    public String getSuperpower(String superpower) {
        return superpower;
    }

}
