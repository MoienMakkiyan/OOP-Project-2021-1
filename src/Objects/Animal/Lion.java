package Objects.Animal;

public class Lion extends Wild{
    private String name;
    protected int lives;

    Lion(String name) {
        super(name);
        this.lives = 3;
        this.name = name;

    }
    public void cage() {
        this.lives--;
    }
}
