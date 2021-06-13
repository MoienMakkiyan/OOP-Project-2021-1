package Objects.Animal;

import java.util.ArrayList;

public class Wild extends Animal {

    private TypeW typeW;
    protected int lives;


    public static ArrayList<Wild> wilds = new ArrayList<>(0);

    Wild(int type) {
        super(type);
        if (type == 1) {
            this.lives = 3;
            this.typeW = TypeW.tiger;
        } else if (type == 2) {
            this.lives = 4;
            this.typeW = TypeW.tiger;
        } else if (type == 3) {
            this.lives = 4;
            this.typeW = TypeW.bear;
        }
    }

    public void cage() {
        this.lives--;
    }
}

enum TypeW {
    lion,
    bear,
    tiger
}

