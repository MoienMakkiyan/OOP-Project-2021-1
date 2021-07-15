package Objects;

public class Mission {
    private int level;
    private int coin;
    private int wild_animal;
    private int bread;
    private int buffalo_milk;
    private int egg;
    private int flour;
    private int icecream;
    private int pocketmilk;
    private int shirt;
    private int textile;
    private int turkey_feather;

    public Mission(int level, int coin, int wild_animal, int bread, int buffalo_milk, int egg, int flour, int icecream, int pocketmilk, int shirt, int textile, int turkey_feather) {
        this.level = level;
        this.coin = coin;
        this.wild_animal = wild_animal;
        this.bread = bread;
        this.buffalo_milk = buffalo_milk;
        this.egg = egg;
        this.flour = flour;
        this.icecream = icecream;
        this.pocketmilk = pocketmilk;
        this.shirt = shirt;
        this.textile = textile;
        this.turkey_feather = turkey_feather;
    }

    public int getLevel() {
        return level;
    }

    public int getCoin() {
        return coin;
    }

    public int getWild_animal() {
        return wild_animal;
    }

    public int getBread() {
        return bread;
    }

    public int getBuffalo_milk() {
        return buffalo_milk;
    }

    public int getEgg() {
        return egg;
    }

    public int getFlour() {
        return flour;
    }

    public int getIcecream() {
        return icecream;
    }

    public int getPocketmilk() {
        return pocketmilk;
    }

    public int getShirt() {
        return shirt;
    }

    public int getTextile() {
        return textile;
    }

    public int getTurkey_feather() {
        return turkey_feather;
    }
}
