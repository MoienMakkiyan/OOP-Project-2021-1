package Objects.Animal;

public class Tiger extends Wild{
    private String name;
    protected int lives;

    Tiger(String name) {
        super(name);
        this.lives = 4;
        this.name = name;

    }
    public void cage() {
        this.lives--;
    }
}
