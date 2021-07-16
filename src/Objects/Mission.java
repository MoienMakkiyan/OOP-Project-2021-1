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
    private int time_passed_in_this_level;

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
        this.time_passed_in_this_level = 0;
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

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void setWild_animal(int wild_animal) {
        this.wild_animal = wild_animal;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }

    public void setBuffalo_milk(int buffalo_milk) {
        this.buffalo_milk = buffalo_milk;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public void setIcecream(int icecream) {
        this.icecream = icecream;
    }

    public void setPocketmilk(int pocketmilk) {
        this.pocketmilk = pocketmilk;
    }

    public void setShirt(int shirt) {
        this.shirt = shirt;
    }

    public void setTextile(int textile) {
        this.textile = textile;
    }

    public void setTurkey_feather(int turkey_feather) {
        this.turkey_feather = turkey_feather;
    }

    public int getTime_passed_in_this_level() {
        return time_passed_in_this_level;
    }

    public void setTime_passed_in_this_level(int time_passed_in_this_level) {
        this.time_passed_in_this_level = time_passed_in_this_level;
    }
}
