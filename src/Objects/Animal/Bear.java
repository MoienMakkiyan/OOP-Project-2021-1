package Objects.Animal;

public class Bear extends Wild{
    private String name;
    protected int lives;

    Bear(String name) {
        super(name);
        this.lives = 4;
        this.name = name;

    }
    public void cage() {
        this.lives--;
    }
}
